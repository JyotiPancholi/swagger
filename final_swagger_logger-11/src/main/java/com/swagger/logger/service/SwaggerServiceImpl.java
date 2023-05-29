package com.swagger.logger.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swagger.logger.Entity.Contact;
import com.swagger.logger.repository.SwaggerRepository;

@Service
public class SwaggerServiceImpl implements SwaggerService{

	@Autowired
	SwaggerRepository repo ;

	@Override
	public Contact saveContact(Contact contact) {
		return repo.save(contact);
		
	}

	@Override
	public List<Contact> findAllContacts() {
		List<Contact> findAll = repo.findAll();
		return findAll;
	}

	@Override
	public Contact getContact(String id) {
		 Optional<Contact> findById = repo.findById(id);
		return findById.get();
	}

}
