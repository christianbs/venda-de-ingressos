package br.com.vendadeingressos.acessoadados;

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
public interface ClienteAcessoADados {

    void incluirCliente(Cliente cliente);

    Cliente consultarClientePorId(long id);

}
