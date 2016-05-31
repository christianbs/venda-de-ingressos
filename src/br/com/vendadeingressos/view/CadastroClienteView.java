/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendadeingressos.view;

import br.com.vendadeingressos.entidade.Cliente;
import br.com.vendadeingressos.servico.CadastroClienteService;
import br.com.vendadeingressos.servico.impl.CadastroClienteServiceImpl;
import java.util.Scanner;

/**
 *
 * @author christian
 */
public class CadastroClienteView {

    private CadastroClienteService service;

    public CadastroClienteView() {
        service = new CadastroClienteServiceImpl();
    }

    public void cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        System.out.print("Digite o nome: ");
        cliente.setNome(scanner.nextLine());
        System.out.print("Digite o telefone: ");
        cliente.setTelefone(scanner.nextLine());
        System.out.print("Digite o endereco: ");
        cliente.setEndereco(scanner.nextLine());
        System.out.print("Digite o cpf: ");
        cliente.setCpf(scanner.nextLine());
        System.out.print("Digite o cartao: ");
        cliente.setCartao(scanner.nextLine());
        service.cadastrarCliente(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

}
