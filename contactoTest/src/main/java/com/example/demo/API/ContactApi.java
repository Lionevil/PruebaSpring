package com.example.demo.API;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.Contact;
import com.example.demo.SERVICE.ContactService;

@RestController
public class ContactApi {
	@Autowired
	ContactService contactService;
	@RequestMapping(value="/contact", method=RequestMethod.POST)
    public Contact updateOrSave(@RequestBody Contact contact){
	return contactService.save(contact);
	}
	@RequestMapping(value="/product", method=RequestMethod.GET)
	    public Contact getById(){
	        return new Contact(1L, "John", "Doe", "+57 311 222 3344", "john@sinbugs.com");
	    }
	}

