/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendadeingressos.acessoadados.impl;

import br.com.vendadeingressos.acessoadados.TipoIngressoAcessoADados;
import br.com.vendadeingressos.bancodedados.BancoDeDadosImprovisado;
import br.com.vendadeingressos.entidade.TipoIngresso;

/**
 *
 * @author christian
 */
public class TipoIngressoAcessoADadosImpl implements TipoIngressoAcessoADados {

    private final BancoDeDadosImprovisado banco;

    public TipoIngressoAcessoADadosImpl() {
        this.banco = BancoDeDadosImprovisado.getInstance();
    }

    @Override
    public TipoIngresso consultarPorId(long id) {
        for (TipoIngresso tipo : banco.getTiposIngresso()) {
            if (tipo.getId() == id) {
                return tipo;
            }
        }
        return null;
    }

}
