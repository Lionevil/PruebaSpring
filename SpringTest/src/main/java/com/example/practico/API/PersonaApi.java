package com.example.practico.API;
import java.util.List;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.practico.DAO.PersonaRepository;
import com.example.practico.DTO.Persona;



@RestController
public class PersonaApi {
	
	@Autowired
	PersonaRepository personaRepository;
	

	// Obtener todas las personas
	
		@GetMapping("/persona/all")
		
		public List<Persona> getAllPersonas() {
		    return personaRepository.findAll();
		}

	    // Agregar una nueva personat
		
		@PostMapping("/persona/new")
		
		public Persona createPersona(@Valid @RequestBody Persona persona) {
			
		    return personaRepository.save(persona);
		}
		

	    // Obtener solo una persona
		
		@GetMapping("/persona/{id}")
		
		public ResponseEntity<Persona> getPersonaById(@PathVariable(value = "id") Long personaId) {
			
		    Persona persona = personaRepository.findOne(personaId);
		    if(persona == null) {
		    	
		        return ResponseEntity.notFound().build();
		    }
		    
		    return ResponseEntity.ok().body(persona);
		}

	    // Actualizar una persona
		
		@PutMapping("/persona/{id}")
		
		public ResponseEntity<Persona> updatePersona(@PathVariable(value = "id") Long personaId,
				
		                                       @Valid @RequestBody Persona personaDetails) {
			
		    Persona persona = personaRepository.findOne(personaId);
		    
		    if(persona == null) {
		    	
		        return ResponseEntity.notFound().build();
		    }
		    persona.setNombre(personaDetails.getNombre());
		    
		    persona.setApellido(personaDetails.getApellido());

		    Persona updatedPersona = personaRepository.save(persona);
		    
		    return ResponseEntity.ok(updatedPersona);
		}

		
	    // Eliminar una persona
		
		@DeleteMapping("/persona/{id}")
		
		public ResponseEntity<Persona> deletePersona(@PathVariable(value = "id") Long personaId) {
			
		    Persona persona = personaRepository.findOne(personaId);
		    if(persona == null) {
		    	
		        return ResponseEntity.notFound().build();
		    }

		    personaRepository.delete(persona);
		    
		    return ResponseEntity.ok().build();
		}
}
		

