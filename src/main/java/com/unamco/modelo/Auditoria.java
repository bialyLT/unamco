package com.unamco.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

import java.time.LocalDateTime;


@Entity
@Table(name = "auditoria")
public class Auditoria {
    
    @Id
    @Column(name = "idAuditoria", nullable =  false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAuditoria;
    @Column(name = "valorAnterior", length = 50, nullable = false)
    private String valorAnterior;
    @Column(name = "valorNuevo", length = 50, nullable = false)
    private String valorNuevo;
    @Column(name = "autor", length = 500, nullable = false)
    private String autor;
    @Column(name = "tipoAutor", nullable = false)
    private TipoAutor tipoAutor;
    @Column(name = "fechaAuditoria", nullable = false)
    private LocalDateTime fechaAuditoria = LocalDateTime.now();
    @ManyToOne
    @JoinColumn(name = "dniUsuario", nullable = false)
    private Usuario usuario;
    
    public Auditoria() {

    }
}