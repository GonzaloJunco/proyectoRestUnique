package com.rest.restEricka.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.NumberFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="persona")
@Data
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPersona;
	
	private String nombres;
	private String apellidos;
	
	private Integer dni;
	
	

}
