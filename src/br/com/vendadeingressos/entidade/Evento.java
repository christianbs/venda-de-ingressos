/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendadeingressos.entidade;

import java.time.Instant;
import java.util.List;

/**
 *
 * @author christian
 */
public class Evento {

    private long id;
    private Instant data;
    private int numeroDeIngressos;
    private List<Ingresso> ingressos;

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public Instant getData() {
        return data;
    }

    public void setData(Instant data) {
        this.data = data;
    }

    public int getNumeroDeIngressos() {
        return numeroDeIngressos;
    }

    public void setNumeroDeIngressos(int numeroDeIngressos) {
        this.numeroDeIngressos = numeroDeIngressos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
