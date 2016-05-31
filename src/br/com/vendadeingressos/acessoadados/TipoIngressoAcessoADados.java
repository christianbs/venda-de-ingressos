/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendadeingressos.acessoadados;

import br.com.vendadeingressos.entidade.TipoIngresso;

/**
 *
 * @author christian
 */
public interface TipoIngressoAcessoADados {

    TipoIngresso consultarPorId(long id);
}
