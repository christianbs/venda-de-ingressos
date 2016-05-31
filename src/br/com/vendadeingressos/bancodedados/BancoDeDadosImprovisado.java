/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendadeingressos.bancodedados;

import br.com.vendadeingressos.entidade.Cliente;
import br.com.vendadeingressos.entidade.Evento;
import br.com.vendadeingressos.entidade.Ingresso;
import br.com.vendadeingressos.entidade.Item;
import br.com.vendadeingressos.entidade.Pedido;
import br.com.vendadeingressos.entidade.TipoIngresso;
import java.math.BigDecimal;
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
    private List<Ingresso> ingressos;
    private List<TipoIngresso> tiposIngresso;
    private List<Item> itens;
    private List<Pedido> pedidos;

    private BancoDeDadosImprovisado() {
        clientes = new ArrayList();
        eventos = new ArrayList();
        ingressos = new ArrayList();
        tiposIngresso = new ArrayList();
        gerarTiposDeIngresso();
        itens = new ArrayList();
        pedidos = new ArrayList();
    }

    public static BancoDeDadosImprovisado getInstance() {
        if (banco == null) {
            banco = new BancoDeDadosImprovisado();
        }
        return banco;
    }

    private void gerarTiposDeIngresso() {
        TipoIngresso tipo1 = new TipoIngresso();
        tipo1.setId(1);
        tipo1.setTipo("Inteiro");
        tipo1.setPreco(BigDecimal.valueOf(25));
        tiposIngresso.add(tipo1);

        TipoIngresso tipo2 = new TipoIngresso();
        tipo2.setId(2);
        tipo2.setTipo("Estudante");
        tipo2.setPreco(BigDecimal.valueOf(12.5));
        tiposIngresso.add(tipo2);
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

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public List<TipoIngresso> getTiposIngresso() {
        return tiposIngresso;
    }

    public void setTiposIngresso(List<TipoIngresso> tiposIngresso) {
        this.tiposIngresso = tiposIngresso;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

}
