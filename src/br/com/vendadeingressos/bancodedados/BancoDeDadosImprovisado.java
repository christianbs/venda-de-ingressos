/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendadeingressos.bancodedados;

import br.com.vendadeingressos.entidade.Cliente;
import br.com.vendadeingressos.entidade.Evento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author christian
 */
public class BancoDeDadosImprovisado {

    private static BancoDeDadosImprovisado banco;
    private List<Cliente> clientes;
    private List<Evento> eventos;

    private BancoDeDadosImprovisado() {
        clientes = new ArrayList();
        eventos = new ArrayList();
    }

    public static BancoDeDadosImprovisado getInstance() {
        if (banco == null) {
            banco = new BancoDeDadosImprovisado();
        }
        return banco;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

}
