package br.Concessionaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Garagem garagem = new Garagem();
        Menu menu = new Menu();
        Scanner leitor = new Scanner(System.in);

        int opcao = -1;

        while(opcao!=0){
            opcao = menu.mostrarMenu();

            if(opcao==1){
                garagem.createCarro();
            } else if (opcao==2) {
                garagem.listarCarros();
            } else if (opcao==3) {
                System.out.println("Digite o id do carro que deseja buscar:");
                int id = leitor.nextInt();
                Carro carro = garagem.buscaCarro(id);
                garagem.readCarro(carro);
            } else if (opcao==4) {
                System.out.println("Digite o id do carro que deseja atualizar:");
                int id = leitor.nextInt();
                garagem.updateCarro(id);
            } else if (opcao==5) {
                System.out.println("Digite o id do carro que deseja excluir:");
                int id = leitor.nextInt();
                garagem.deleteCarro(id);
            } else if (opcao!=0) {
                System.out.println("Opcao invalida!");
            }
        }

        System.out.println("Saindo...");
    }
}