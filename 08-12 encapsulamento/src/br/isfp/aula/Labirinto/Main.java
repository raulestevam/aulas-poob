package br.Labirinto;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Sala s1 = new Sala("Sala 1");
        Sala s2 = new Sala("Sala 2");
        Sala s3 = new Sala("Sala 3");
        Sala s4 = new Sala("Sala 4");

        s1.setN(s2);
        s2.setS(s1);

        s1.setS(s3);
        s3.setS(s1);

        Navegador nav = new Navegador(s1);
        Menu menu = new Menu();

        int opcao = 0;

        while(opcao!=5){
            opcao=menu.mostrarMenu();
            if(opcao==1){
                nav.navegarNorte();
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
