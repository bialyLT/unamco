package com.unamco.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "universidad")
public class Universidad {
    
    @Id
    @Column(name = "idUniversidad", nullable =  false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUniversidad;
    @Column(name = "nombreUniversidad", length = 100, nullable = false)
    private String nombreUniversidad;
    @Column(name = "emailUniversidad", length = 100, nullable = false)
    private String emailUniversidad;
    
    @OneToMany
    @JoinColumn(name = "idFacultad")
    private Facultad facultad;
    
    @OneToMany
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;



}
