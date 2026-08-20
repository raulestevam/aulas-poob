package br.Concessionaria;

import java.util.Scanner;

public class Menu {
    Scanner leitor = new Scanner(System.in);

    public int mostrarMenu(){
        System.out.println("Selecione sua opcao:");
        System.out.println("1 - Cadastrar carro:");
        System.out.println("2 - Exibir todos os carros:");
        System.out.println("3 - Buscar carro:");
        System.out.println("4 - Atualizar carro:");
        System.out.println("5 - Excluir carro:");
        System.out.println("0 - Sair:");

        int opcao = leitor.nextInt();
        return opcao;
    }
}