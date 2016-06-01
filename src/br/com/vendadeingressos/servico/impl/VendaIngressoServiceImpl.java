/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendadeingressos.servico.impl;

import br.com.vendadeingressos.acessoadados.ClienteAcessoADados;
import br.com.vendadeingressos.acessoadados.EventoAcessoADados;
import br.com.vendadeingressos.acessoadados.IngressoAcessoADados;
import br.com.vendadeingressos.acessoadados.ItemAcessoADados;
import br.com.vendadeingressos.acessoadados.TipoIngressoAcessoADados;
import br.com.vendadeingressos.acessoadados.impl.ClienteAcessoADadosImpl;
import br.com.vendadeingressos.acessoadados.impl.EventoAcessoADadosImpl;
import br.com.vendadeingressos.acessoadados.impl.IngressoAcessoADadosImpl;
import br.com.vendadeingressos.acessoadados.impl.ItemAcessoADadosImpl;
import br.com.vendadeingressos.acessoadados.impl.TipoIngressoAcessoADadosImpl;
import br.com.vendadeingressos.entidade.Cliente;
import br.com.vendadeingressos.entidade.Evento;
import br.com.vendadeingressos.entidade.Ingresso;
import br.com.vendadeingressos.entidade.Item;
import br.com.vendadeingressos.entidade.Pedido;
import br.com.vendadeingressos.servico.VendaIngressoService;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author christian
 */
public class VendaIngressoServiceImpl implements VendaIngressoService {

    private final ClienteAcessoADados dadosCliente;
    private final EventoAcessoADados dadosEvento;
    private final IngressoAcessoADados dadosIngresso;
    private final TipoIngressoAcessoADados dadosTipoIngresso;
    private final ItemAcessoADados dadosItem;

    public VendaIngressoServiceImpl() {
        dadosCliente = new ClienteAcessoADadosImpl();
        dadosEvento = new EventoAcessoADadosImpl();
        dadosIngresso = new IngressoAcessoADadosImpl();
        dadosTipoIngresso = new TipoIngressoAcessoADadosImpl();
        dadosItem = new ItemAcessoADadosImpl();
    }

    @Override
    public void venderIngresso(long idCliente, long idEvento, int quantidadeIngressos, int quantidadeComDesconto) {
        Cliente cliente = dadosCliente.consultarClientePorId(idCliente);
        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }
        Evento evento = dadosEvento.consultarEventoPorId(idEvento);
        if (evento == null) {
            System.out.println("Evento não encontrado.");
            return;
        }
        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setData(Instant.now());
        pedido.setStatus("Efetuado");

        List<Item> itens = new ArrayList();
        for (int i = 0; i < quantidadeIngressos; i++) {
            Ingresso ingresso = new Ingresso();
            ingresso.setEvento(evento);
            if (quantidadeComDesconto > 0) {
                ingresso.setTipoIngresso(dadosTipoIngresso.consultarPorId(1));
            } else {
                ingresso.setTipoIngresso(dadosTipoIngresso.consultarPorId(2));
            }
            dadosIngresso.inserirIngresso(ingresso);
            evento.getIngressos().add(ingresso);
            Item item = new Item();
            item.setIngresso(ingresso);
            dadosItem.inserirItem(item);
            itens.add(item);
        }
        pedido.setItens(itens);
        System.out.println("Pedido salvo com sucesso.");
    }

}
