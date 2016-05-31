/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendadeingressos.acessoadados.impl;

import br.com.vendadeingressos.acessoadados.PedidoAcessoADados;
import br.com.vendadeingressos.bancodedados.BancoDeDadosImprovisado;
import br.com.vendadeingressos.entidade.Pedido;

/**
 *
 * @author christian
 */
public class PedidoAcessoADadosImpl implements PedidoAcessoADados {

    private final BancoDeDadosImprovisado banco;

    public PedidoAcessoADadosImpl() {
        this.banco = BancoDeDadosImprovisado.getInstance();
    }

    @Override
    public void inserirPedido(Pedido pedido) {
        criarIdPedido(pedido);
        banco.getPedidos().add(pedido);
    }

    private void criarIdPedido(Pedido pedido) {
        int registros = banco.getPedidos().size();
        pedido.setNumero(++registros);
    }

}
