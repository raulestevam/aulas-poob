package br.DatabaseMemory.UI;

import br.DatabaseMemory.Model.Cliente;

import java.util.Scanner;

public class UICadCliente {
    Scanner leitor = new Scanner(System.in);

    public Cliente cadastrarCliente(){
        System.out.println("=====CADASTRO DE CLIENTE =====");
        System.out.println("Digite os dados do cliente: ");

        System.out.println("\n id: ");
        int id = leitor.nextInt();
        System.out.println("\n nome: ");
        String nome = leitor.next();
        System.out.println("\n endereco: ");
        String endereco = leitor.next();

        Cliente cliente = new Cliente();
        cliente.setId(id);
        cliente.setNome(nome);
        cliente.setEndereco(endereco);

        return cliente;
    }
}
