package com.unamco.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "provincia")
public class Provincia {

    @Id
    @Column(name = "idProvincia", nullable =  false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProvincia;
    @Column(name = "nombreProvincia", length = 100, nullable = false)
    private Boolean nombreProvincia;

    @OneToMany
    @JoinColumn(name = "idCiudad")
    private Ciudad ciudad;

    @ManyToOne
    @JoinColumn(name = "idPais")
    private Pais pais;

}
