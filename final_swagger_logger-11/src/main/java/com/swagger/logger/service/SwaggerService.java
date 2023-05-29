package com.swagger.logger.service;

import java.util.List;

import com.swagger.logger.Entity.Contact;


public interface SwaggerService {
	Contact saveContact(Contact contact);

	public List<Contact> findAllContacts();

	Contact getContact(String id);
}
