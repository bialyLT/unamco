package com.unamco.modelo;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipoSancion")
public class TipoSancion {
    
    @Id
    @Column(name = "idTipoSancion", nullable =  false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoSancion;
    @Column(name = "detalleSancion", length = 50, nullable = false)
    private String detalleSancion;

    @OneToMany
    @JoinColumn(name = "idSancion")
    private Set<Sancion> sanciones = new HashSet<>();
}
