package com.example.practico.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Persona implements Serializable {
private static final long serialVersionUID=4894729030347835498L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	
	@NotBlank
	private String nombre;
	
	@NotBlank
	private String apellido;
	
	
		public Persona() {
			
		}
	
		public Persona(Long id, String nombre, String apellido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}

		
		
		
		

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		@Override
		public String toString() {
			return "Contact [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", getId()=" + getId()
					+ ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
			
		
		
		
		}

