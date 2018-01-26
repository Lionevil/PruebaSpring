package com.example.demo.SERVICE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.ContactRepository;
import com.example.demo.DTO.Contact;

@Service
public class ContactService {
@Autowired
ContactRepository DAO;

public Contact save(Contact contact) {
	return DAO.saveAndFlush(contact);
}
}
