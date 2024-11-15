package com.unamco.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pago")
public class Pago {
    
    @Id
    @Column(name = "idPago", nullable =  false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPago;
    @Column(name = "valorPagado", nullable = false)
    private float valorPagado;
    @Column(name = "valorPendiente", nullable = false)
    private float valorPendiente;
    @Column(name = "descuento", nullable = false)
    private float descuento;

    @ManyToOne
    @JoinColumn(name = "idCupo")
    private Cupo cupo;

}
