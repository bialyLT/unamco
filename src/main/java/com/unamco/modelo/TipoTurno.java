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
@Table(name = "tipoTurno")
public class TipoTurno {
    
    @Id
    @Column(name = "idTipoTurno", nullable =  false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoTurno;
    @Column(name = "tipoDeTurno", length = 50, nullable = false)
    private String tipoDeTurno;

    @OneToMany
    @JoinColumn(name = "idTurno")
    private Turno turno;
}
