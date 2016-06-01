/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendadeingressos.view;

import br.com.vendadeingressos.entidade.Evento;
import br.com.vendadeingressos.servico.CadastroEventoService;
import br.com.vendadeingressos.servico.impl.CadastroEventoServiceImpl;
import java.time.Instant;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author christian
 */
public class CadastroEventoView {

    private CadastroEventoService service;

    public CadastroEventoView() {
        service = new CadastroEventoServiceImpl();
    }

    public void cadastrarEvento() {
        Evento evento = new Evento();
        Scanner scanner = new Scanner(System.in);
        while (evento.getNumeroDeIngressos() < 1) {
            try {
                System.out.print("Digite o número de ingressos: ");
                int numeroIngressos = scanner.nextInt();
                if (numeroIngressos < 1) {
                    throw new InputMismatchException();
                }
                evento.setNumeroDeIngressos(numeroIngressos);
            } catch (InputMismatchException e) {
                System.out.println("Número inválido");
            }
        }
        scanner.nextLine();
        while (evento.getData() == null) {
            try {
                System.out.print("Digite a data do evento(yyyy-MM-dd): ");
                Instant dataEvento = Instant.parse(scanner.nextLine() + "T00:00:00Z");
                evento.setData(dataEvento);
            } catch (Exception e) {
                System.out.println("Data inválida");
            }
        }
        service.cadastrarEvento(evento);
        System.out.println("Evento cadastrado com sucesso!");
    }

}
