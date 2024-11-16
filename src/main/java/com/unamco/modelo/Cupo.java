package com.unamco.modelo;

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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cupo")
public class Cupo {
    
    @Id
    @Column(name = "idCupo", nullable =  false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCupo;
    @Column(name = "horaEntrada", nullable = false)
    private LocalDateTime horaEntrada;
    @Column(name = "horaSalida", nullable = false)
    private LocalDateTime horaSalida;
    @Column(name = "estadoAsistencia", nullable = false)
    private EstadoAsistencia estadoAsistencia;

    @OneToMany
    @JoinColumn(name = "idPago")
    private Set<Pago> pagos = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "idComensal")
    private Comensal comensal;
    
    @ManyToMany
    @JoinTable(name = "detalleTurno", joinColumns = @JoinColumn(name = "idCupo"), inverseJoinColumns = @JoinColumn(name = "idTurno"))
    private Set<Turno> turnos = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "detallePreferencia", joinColumns = @JoinColumn(name = "idCupo"), inverseJoinColumns = @JoinColumn(name = "idPreferencia"))
    private Set<Preferencia> preferencias = new HashSet<>();

}
