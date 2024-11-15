package com.unamco.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unamco.modelo.Paso;

public interface PasoRepositorio extends JpaRepository<Paso, Integer>{
    
}
