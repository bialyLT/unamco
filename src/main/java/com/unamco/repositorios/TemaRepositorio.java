package com.unamco.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unamco.modelo.Tema;

public interface TemaRepositorio extends JpaRepository<Tema, Integer> {
    
}
