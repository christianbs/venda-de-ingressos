/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendadeingressos.view;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author christian
 */
public class Inicio {

    public static void main(String[] args) {
        boolean escolhendo = true;

        while (escolhendo) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Seja Bem Vindo");
            System.out.println("1 - Venda de Ingresso.");
            System.out.println("2 - Cadastro de Cliente");
            System.out.println("3 - Cadastro de Evento");
            System.out.println("4 - Reserva de Ingresso");
            System.out.println("5 - Cadastro da Chave de Rastreio");
            System.out.println("0 - Sair");

            try {
                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 0:
                        escolhendo = false;
                        break;
                    case 1:
                        new VendaIngressoView().venderIngresso();
                        break;
                    case 2:
                        new CadastroClienteView().cadastrarCliente();
                        break;
                    case 3:
                        new CadastroEventoView().cadastrarEvento();
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    default:
                        throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Opção Inválida!");
            }
        }
    }

}
