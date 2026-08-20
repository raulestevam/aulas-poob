package br.Concessionaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Garagem garagem = new Garagem();

        Menu menu = new Menu();

        int opcao = 0;

        while(opcao!=5){
            opcao=menu.mostrarMenu();
            if(opcao==1){
                garagem.createCarro();
            } else if (opcao==2) {
                nav.navegarSul();
            } else if (opcao==3) {
                nav.navegarSul();
            } else if (opcao==4) {
                nav.navegarNorte();
            }
        }
    }
}