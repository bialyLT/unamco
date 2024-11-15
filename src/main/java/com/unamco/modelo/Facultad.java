package com.unamco.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "facultad")
public class Facultad {
    
    @Id
    @Column(name = "idFacultad", nullable =  false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFacultad;
    @Column(name = "nombreFacultad", length = 100, nullable = false)
    private String nombreFacultad;
    @Column(name = "emailFacultad", length = 100, nullable = false)
    private String emailFacultad;
    @ManyToOne
    @JoinColumn(name = "idUniversidad")
    private Facultad universidad;
}
