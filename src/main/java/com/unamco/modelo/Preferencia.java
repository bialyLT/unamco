package com.unamco.modelo;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "preferencia")
public class Preferencia {
    
    @Id
    @Column(name = "idPreferencia", nullable =  false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPreferencia;
    @Column(name = "nombrePreferencia", length = 100, nullable = false)
    private String nombrePreferencia;

    @ManyToMany
    @JoinTable(name = "detallePreferencia", joinColumns = @JoinColumn(name = "idPreferencia"), inverseJoinColumns = @JoinColumn(name = "idCupo"))
    private Set<Cupo> cupos = new HashSet<>();
 
}
