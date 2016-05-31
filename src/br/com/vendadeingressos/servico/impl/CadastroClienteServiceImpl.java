/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendadeingressos.servico.impl;

import br.com.vendadeingressos.acessoadados.ClienteAcessoADados;
import br.com.vendadeingressos.acessoadados.impl.ClienteAcessoADadosImpl;
import br.com.vendadeingressos.entidade.Cliente;
import br.com.vendadeingressos.servico.CadastroClienteService;

/**
 *
 * @author christian
 */
public class CadastroClienteServiceImpl implements CadastroClienteService {

    private final ClienteAcessoADados dados;

    public CadastroClienteServiceImpl() {
        dados = new ClienteAcessoADadosImpl();
    }

    @Override
    public void cadastrarCliente(Cliente cliente) {
        dados.incluirCliente(cliente);
    }

}
