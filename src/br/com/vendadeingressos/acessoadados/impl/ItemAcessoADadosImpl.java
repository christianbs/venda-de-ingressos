/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendadeingressos.acessoadados.impl;

import br.com.vendadeingressos.acessoadados.ItemAcessoADados;
import br.com.vendadeingressos.bancodedados.BancoDeDadosImprovisado;
import br.com.vendadeingressos.entidade.Item;

/**
 *
 * @author christian
 */
public class ItemAcessoADadosImpl implements ItemAcessoADados {

    private BancoDeDadosImprovisado banco;

    public ItemAcessoADadosImpl() {
        banco = BancoDeDadosImprovisado.getInstance();
    }

    @Override
    public void inserirItem(Item item) {
        criarIdItem(item);
        banco.getItens().add(item);
    }

    private void criarIdItem(Item item) {
        int registros = banco.getItens().size();
        item.setId(++registros);
    }

}
