/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendadeingressos.servico;

import br.com.vendadeingressos.entidade.Ingresso;

/**
 *
 * @author christian
 */
public interface VendaIngressoService {

    void venderIngresso(long idCliente, long idEvento, int quantidadeIngressos, int quantidadeComDesconto);

}
