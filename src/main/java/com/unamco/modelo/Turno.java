package com.unamco.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipoTurno")
public class Turno {
    
    @Id
    @Column(name = "idTurno", nullable =  false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTurno;
    @Column(name = "estado", nullable = false)
    private boolean estado;
    @Column(name = "fechaTurno", nullable = false)
    private LocalDate fechaTurno;
    @Column(name = "horaInicio", nullable = false)
    private LocalDateTime horaInicio;
    @Column(name = "horaCierre", nullable = false)
    private LocalDateTime horaCierre;

    @ManyToOne
    @JoinColumn(name = "idComedor")
    private Comedor comedor;
    
    @ManyToOne
    @JoinColumn(name = "idTipoTurno")
    private TipoTurno tipoTurno;

    @ManyToMany
    @JoinTable(name = "detalleTurno", joinColumns = @JoinColumn(name = "idTurno"), inverseJoinColumns = @JoinColumn(name = "idCupo"))
    private Set<Cupo> cupos = new HashSet<>();


}
