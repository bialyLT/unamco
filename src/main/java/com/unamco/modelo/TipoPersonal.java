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
@Table(name = "tipoPersonal")
public class TipoPersonal {
    
    @Id
    @Column(name = "idTipoPersonal", nullable =  false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoPersonal;
    @Column(name = "tipoDePersonal", length = 50, nullable = false)
    private String tipoDePersonal;

    @OneToMany
    @JoinColumn(name = "idPersonal")
    private Personal personal;
}
