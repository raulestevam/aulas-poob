package br.Exercicio8;

import br.Exercicio7.Carro;
import br.Exercicio7.Consultoria;
import br.Exercicio7.ICMS;

public class Main {
    public static void main(String args[]) {
        ICMS compra[] = new ICMS[2];
        compra[0] = new Consultoria(5.6);
        compra[1] = new Carro();
        compra[0].meuICMS();
        //compra[1] = new ICMS();
        // System.out.println( "Faturas e empregados processados polifomicamente pela interface:\n ");
        // processa os ICMS
        // for (int i = 0; i <  compra.length; i++) {
        // System.out.println(compra[i].toString() + " Aliquita " + compra[i].meuICMS()); //}
        }
}

