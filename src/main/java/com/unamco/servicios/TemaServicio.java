package com.unamco.servicios;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unamco.modelo.Estado;
import com.unamco.modelo.Paso;
import com.unamco.modelo.Tema;
import com.unamco.repositorios.PasoRepositorio;
import com.unamco.repositorios.TemaRepositorio;

@Service
public class TemaServicio {
    @Autowired
    TemaRepositorio temaRepositorio;
    @Autowired
    PasoRepositorio pasoRepositorio;

    public TemaServicio (TemaRepositorio temaRepositorio, PasoRepositorio pasoRepositorio) {
        this.temaRepositorio = temaRepositorio;
        this.pasoRepositorio = pasoRepositorio;
    }

    public void agregarTema(Tema tema) {
        temaRepositorio.save(tema);
    }

    public List<Tema> buscarTemas() {
        return temaRepositorio.findAll();
    }

    public Tema buscarTemaPorId(int id) {
        return temaRepositorio.findById(id).
            orElseThrow(() -> new EntidadNoEncontradaExcepcion(id));
    }

    public void actualizarTemaPorId(int id, Paso paso) {
        temaRepositorio.findById(id).
            ifPresent(temaObtenido -> {
                temaObtenido.getPasos().add(paso);
                temaRepositorio.save(temaObtenido);
                pasoRepositorio.save(paso);
            });
    }

    public void cerrarTemaPorId(int id, Tema tema) {
        temaRepositorio.findById(id).
            ifPresent(temaObtenido -> {
                temaObtenido.setFechaCierre(LocalDate.now());
                temaObtenido.setEstado(Estado.CERRADO);
                temaRepositorio.save(temaObtenido);
            });
    }

}