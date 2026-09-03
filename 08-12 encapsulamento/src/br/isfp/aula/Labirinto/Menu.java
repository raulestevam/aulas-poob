package br.Labirinto;

import java.util.Scanner;

public class Menu {
    Scanner leitor = new Scanner(System.in);

    public int mostrarMenu(){
        System.out.println("Escolha uma opcao: ");
        System.out.println("1 - Norte: ");
        System.out.println("2 - Sul: ");
        System.out.println("3 - Leste: ");
        System.out.println("4 - Oeste: ");
        System.out.println("5 - sair");

        int opcao = leitor.nextInt();
        return opcao;
    }
}
