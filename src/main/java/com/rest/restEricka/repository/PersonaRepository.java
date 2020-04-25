package com.rest.restEricka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.restEricka.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer>{

}
