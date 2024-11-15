package com.unamco.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unamco.modelo.Persona;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Integer> {
    List<Persona> findAllByBaja(boolean baja);
}