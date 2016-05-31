/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendadeingressos.acessoadados.impl;

import br.com.vendadeingressos.acessoadados.EventoAcessoADados;
import br.com.vendadeingressos.bancodedados.BancoDeDadosImprovisado;
import br.com.vendadeingressos.entidade.Evento;

/**
 *
 * @author christian
 */
public class EventoAcessoADadosImpl implements EventoAcessoADados {

    private BancoDeDadosImprovisado banco;

    public EventoAcessoADadosImpl() {
        banco = BancoDeDadosImprovisado.getInstance();
    }

    @Override
    public void incluirEvento(Evento evento) {
        criarIdEvento(evento);
        banco.getEventos().add(evento);
    }

    private void criarIdEvento(Evento evento) {
        int registros = banco.getEventos().size();
        evento.setId(++registros);
    }

    @Override
    public Evento consultarEventoPorId(long id) {
        for (Evento evento : banco.getEventos()) {
            if (evento.getId() == id) {
                return evento;
            }
        }
        return null;
    }

}
