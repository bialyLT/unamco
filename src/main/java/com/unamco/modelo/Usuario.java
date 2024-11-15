package com.unamco.modelo;

import java.time.LocalDate;
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
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id
    @Column(name = "dniUsuario", nullable =  false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dniUsuario;
    @Column(name = "estado", nullable = false)
    private boolean estado;
    @Column(name = "apellidoUsuario", length = 50, nullable = false)
    private String apellidoUsuario;
    @Column(name = "nombreUsuario", length = 50, nullable = false)
    private String nombreUsuario;
    @Column(name = "telefonoUsuario", nullable = false)
    private int telefonoUsuario;
    @Column(name = "emailUsuario", length = 50, nullable = false)
    private String emailUsuario;
    @Column(name = "sexoUsuario", nullable = false)
    private Boolean sexoUsuario;
    @Column(name = "domicilioUsuario", length = 150, nullable = false)
    private String domicilioUsuario;
    @Column(name = "fechaNacimiento", nullable = false)
    private LocalDate fechaNacimiento;
    @Column(name = "fotoUsuario", length = 200, nullable = false)
    private String fotoUsuario;

    @OneToMany
    @JoinColumn(name = "idAuditoria")
    private Auditoria auditoria;

    @ManyToOne
    @JoinColumn(name = "idUniversidad")
    private Universidad universidad;

    @OneToOne
    @JoinColumn(name = "idPersonal")
    private Personal personal;

    @OneToOne
    @JoinColumn(name = "idComensal")
    private Comensal comensal;

    @ManyToMany
    @JoinTable(name = "detalleUsuarioComedor", joinColumns = @JoinColumn(name = "idUsuario"), inverseJoinColumns = @JoinColumn(name = "idComedor"))
    private Set<Comedor> comedores = new HashSet<>();

}
