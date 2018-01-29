package com.example.practico.DAO;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practico.DTO.Persona;


public interface PersonaRepository extends JpaRepository<Persona,Long> {

}
