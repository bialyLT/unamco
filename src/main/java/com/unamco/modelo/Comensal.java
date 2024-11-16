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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "comensal")
public class Comensal {

    @Id
    @Column(name = "idComensal", nullable =  false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComensal;
    @Column(name = "estado", nullable = false)
    private Boolean estado;
    @Column(name = "codigoQR", length = 300, nullable = false)
    private String codigoQR;
    
    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @OneToMany
    @JoinColumn(name = "idSancion")
    private Set<Sancion> sanciones = new HashSet<>();
    
    @OneToMany
    @JoinColumn(name = "idCupo")
    private Set<Cupo> cupos = new HashSet<>();

}

