package com.unamco.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "sancion")
public class Sancion {
    
    @Id
    @Column(name = "idSancion", nullable =  false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSancion;
    @Column(name = "fechaInicio", nullable = false)
    private LocalDateTime fechaInicio;
    @Column(name = "fechaFin", nullable = false)
    private LocalDateTime fechaFin;
    @Column(name = "duracion", nullable = false)
    private LocalDateTime duracion;

    @ManyToOne
    @JoinColumn(name = "idTipoSancion")
    private TipoSancion tipoSancion;

    @ManyToOne
    @JoinColumn(name = "idComensal")
    private Comensal comensal;


}
