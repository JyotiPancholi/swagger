package com.swagger.logger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swagger.logger.Entity.Contact;


public interface SwaggerRepository extends JpaRepository<Contact, String>{

}
