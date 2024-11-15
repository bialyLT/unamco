package com.unamco.modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "personal")
public class Personal {
    
    @Id
    @Column(name = "idPersonal", nullable =  false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersonal;
    @Column(name = "fechaEntradaPersonal", nullable = false)
    private LocalDate fechaEntradaPersonal;
    @Column(name = "fechaSalidaPersonal", nullable = false)
    private LocalDate fechaSalidaPersonal;

    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idTipoPersonal")
    private TipoPersonal tipoPersonal;

}
