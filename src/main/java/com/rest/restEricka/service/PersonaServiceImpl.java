package com.rest.restEricka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.restEricka.model.Persona;
import com.rest.restEricka.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService{

	@Autowired
	private PersonaRepository repoPer;
	
	@Override
	public Persona registar(Persona persona) {
		return repoPer.save(persona);
	}

	@Override
	public Persona listarId(Integer idPersona) {
		return repoPer.findById(idPersona).orElse(null);
	}

	@Override
	public List<Persona> listarTodos() {
		return repoPer.findAll();
	}

	@Override
	public void eliminar(Integer idPersona) {
		repoPer.deleteById(idPersona);
		
	}

}
