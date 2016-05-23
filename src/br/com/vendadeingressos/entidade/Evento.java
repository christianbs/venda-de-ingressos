/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendadeingressos.entidade;

import java.time.Instant;

/**
 *
 * @author christian
 */
public class Evento {

    private Instant data;
    private int numeroDeIngressos;

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

}
