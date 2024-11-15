package com.unamco.modelo;

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
@Table(name = "ciudad")
public class Ciudad {

    @Id
    @Column(name = "idCiudad", nullable =  false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCiudad;
    @Column(name = "nombreCiudad", length = 100, nullable = false)
    private Boolean nombreCiudad;

    @OneToOne
    @JoinColumn(name = "idComedor")
    private Comedor comedor;

    @ManyToOne
    @JoinColumn(name = "idProvincia")
    private Provincia provincia;
}
