/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendadeingressos.acessoadados.impl;

import br.com.vendadeingressos.acessoadados.IngressoAcessoADados;
import br.com.vendadeingressos.bancodedados.BancoDeDadosImprovisado;
import br.com.vendadeingressos.entidade.Ingresso;

/**
 *
 * @author christian
 */
public class IngressoAcessoADadosImpl implements IngressoAcessoADados {
    
    private final BancoDeDadosImprovisado banco;
    
    public IngressoAcessoADadosImpl() {
        banco = BancoDeDadosImprovisado.getInstance();
    }
    
    @Override
    public void inserirIngresso(Ingresso ingresso) {
        criarIdsIngresso(ingresso);
        banco.getIngressos().add(ingresso);
    }
    
    private void criarIdsIngresso(Ingresso ingresso) {
        int ingressosDoEvento = ingresso.getEvento().getIngressos().size();
        ingresso.setNumero(++ingressosDoEvento);
        int registros = banco.getIngressos().size();
        ingresso.setId(++registros);
    }
    
}
