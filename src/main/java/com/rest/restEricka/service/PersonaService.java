package com.rest.restEricka.service;

import java.util.List;

import com.rest.restEricka.model.Persona;

public interface PersonaService {
	
		//Metodo registrar
		public Persona registar(Persona persona);
		
		//Metodo buscar por ID
		public Persona listarId(Integer idPersona);
		
		//metodo listar
		public List<Persona> listarTodos();
		
		//metodo eliminar
		public void eliminar(Integer idPersona);

}
