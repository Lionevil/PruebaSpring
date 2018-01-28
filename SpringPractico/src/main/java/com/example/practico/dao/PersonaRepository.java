package com.example.practico.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.practico.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long>{

}
