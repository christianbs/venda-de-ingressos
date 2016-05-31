/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendadeingressos.view;

import br.com.vendadeingressos.entidade.Evento;
import br.com.vendadeingressos.servico.VendaIngressoService;
import br.com.vendadeingressos.servico.impl.VendaIngressoServiceImpl;
import java.util.Scanner;

/**
 *
 * @author christian
 */
public class VendaIngressoView {

    private VendaIngressoService service;

    public VendaIngressoView() {
        service = new VendaIngressoServiceImpl();
    }

    public void venderIngresso() {

        Scanner scanner = new Scanner(System.in);
        Evento evento = new Evento();
        System.out.print("Digite o id do cliente: ");
        long idCliente = scanner.nextLong();

        System.out.print("Digite o id do evento: ");
        long idEvento = scanner.nextLong();

        System.out.print("Digite a quantidade de ingressos: ");
        int quantidadeDeIngressos = scanner.nextInt();

        System.out.print("Digite a quantidade de ingressos com desconto: ");
        int quantidadeComDesconto = scanner.nextInt();

        service.venderIngresso(idCliente, idEvento, quantidadeDeIngressos, quantidadeComDesconto);
    }

}
