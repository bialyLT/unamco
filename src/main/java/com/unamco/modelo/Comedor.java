package com.unamco.modelo;

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
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "comedor")
public class Comedor {

    @Id
    @Column(name = "idComedor", nullable =  false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComedor;
    @Column(name = "estado", nullable = false)
    private Boolean estado;
    @Column(name = "capacidadMax", nullable = false)
    private int capacidadMax;
    @Column(name = "direccion", nullable = false)
    private String direccion;

    @OneToMany
    @JoinColumn(name = "idTurno")
    private Turno turno;

    @OneToOne
    @JoinColumn(name = "idCiudad")
    private Ciudad ciudad;

    @ManyToMany
    @JoinTable(name = "detalleUsuarioComedor", joinColumns = @JoinColumn(name = "idComedor"), inverseJoinColumns = @JoinColumn(name = "idUsuario"))
    private Set<Comedor> usuarios = new HashSet<>();
}
