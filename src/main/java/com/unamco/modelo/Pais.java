package com.unamco.modelo;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "pais")
public class Pais {

    @Id
    @Column(name = "idPais", nullable =  false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPais;
    @Column(name = "nombrePais", length = 100, nullable = false)
    private Boolean nombrePais;

    @OneToMany
    @JoinColumn(name = "idProvincia")
    private Set<Provincia> provincias = new HashSet<>();

}
