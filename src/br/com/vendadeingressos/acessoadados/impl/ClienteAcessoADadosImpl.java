package br.com.vendadeingressos.acessoadados.impl;

import br.com.vendadeingressos.acessoadados.ClienteAcessoADados;
import br.com.vendadeingressos.bancodedados.BancoDeDadosImprovisado;
import br.com.vendadeingressos.entidade.Cliente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author christian
 */
public class ClienteAcessoADadosImpl implements ClienteAcessoADados {

    private BancoDeDadosImprovisado banco;

    public ClienteAcessoADadosImpl() {
        banco = BancoDeDadosImprovisado.getInstance();
    }

    @Override
    public void incluirCliente(Cliente cliente) {
        criarIdCliente(cliente);
        banco.getClientes().add(cliente);
    }

    private void criarIdCliente(Cliente cliente) {
        int registrosSalvos = banco.getClientes().size();
        cliente.setId(++registrosSalvos);
    }

}
