package com.example.demo.DAO;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.DTO.Contact;

public interface ContactRepository extends JpaRepository<Contact,Long> {

}
