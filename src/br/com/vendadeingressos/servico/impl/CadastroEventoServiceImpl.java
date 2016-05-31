/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendadeingressos.servico.impl;

import br.com.vendadeingressos.acessoadados.EventoAcessoADados;
import br.com.vendadeingressos.acessoadados.impl.EventoAcessoADadosImpl;
import br.com.vendadeingressos.entidade.Evento;
import br.com.vendadeingressos.servico.CadastroEventoService;

/**
 *
 * @author christian
 */
public class CadastroEventoServiceImpl implements CadastroEventoService {
    
    private EventoAcessoADados dados;
    
    public CadastroEventoServiceImpl() {
        dados = new EventoAcessoADadosImpl();
    }
    
    @Override
    public void cadastrarEvento(Evento evento) {
        dados.incluirEvento(evento);
    }
    
}
