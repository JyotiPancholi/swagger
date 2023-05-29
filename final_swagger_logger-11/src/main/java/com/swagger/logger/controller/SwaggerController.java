package com.swagger.logger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swagger.logger.Entity.Contact;
import com.swagger.logger.service.SwaggerServiceImpl;

@RequestMapping("/swagger")
@RestController
public class SwaggerController {

	@Autowired
	private SwaggerServiceImpl service;
	
	@GetMapping("/getContact/{id}")
	public Contact getContact(@PathVariable String id) {
		return service.getContact(id);
	}
	
	@GetMapping("/getAllContact")
	public List<Contact> getAllContact() {
		return service.findAllContacts();
	}
	
	@PostMapping("/addContact")
	public Contact addContact(@RequestBody Contact contact) {
		return service.saveContact(contact);
	}
	
}

