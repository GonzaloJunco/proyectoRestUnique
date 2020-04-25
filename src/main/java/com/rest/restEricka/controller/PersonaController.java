package com.rest.restEricka.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.restEricka.model.Persona;
import com.rest.restEricka.service.PersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {
	
	@Autowired
	private PersonaService serviPer;
	
	@PostMapping("/registrar")
	private ResponseEntity<Persona> registrar(@RequestBody Persona persona){
		return new ResponseEntity<Persona>(serviPer.registar(persona),HttpStatus.CREATED);
	}
	
	@GetMapping("/listar/{id}")
	private ResponseEntity<Persona> listarId(@PathVariable Integer id){
		Persona persona = serviPer.listarId(id);
		return new ResponseEntity<Persona>(persona,HttpStatus.OK);
	}
	
	@PutMapping("/actualizar/{id}")
	private ResponseEntity<Persona> actualizar(@RequestBody Persona persona,@PathVariable Integer id){
		Persona personaActual = serviPer.listarId(id);
		personaActual.setNombres(persona.getNombres());
		personaActual.setApellidos(persona.getApellidos());
		personaActual.setDni(persona.getDni());
		return new ResponseEntity<Persona>(serviPer.registar(personaActual),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Map<String, Object>> eliminar(@PathVariable Integer id){
		Map<String, Object> respuesta = new HashMap<String,Object>();
		serviPer.eliminar(id);
		respuesta.put("mensaje", "Eliminacion Exitosa");
		return new ResponseEntity<Map<String, Object>>(respuesta,HttpStatus.OK);
	}
	
	@GetMapping("/listarTodos")
	public ResponseEntity<List<Persona>> listarTodos(){
		return new ResponseEntity<List<Persona>>(serviPer.listarTodos(),HttpStatus.OK);
	}
	
	

}
