/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendadeingressos.acessoadados;

import br.com.vendadeingressos.entidade.Evento;

/**
 *
 * @author christian
 */
public interface EventoAcessoADados {

    void incluirEvento(Evento evento);

    Evento consultarEventoPorId(long id);

}
