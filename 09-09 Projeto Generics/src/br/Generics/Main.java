package br.Generics;

public class Main {
    public static void main (String[] args){
        //tipos primitivos, calculos que exigem mais velozes
        int a = 10;
        Integer n=10;
        double c=3.14;
        Double d = 3.14;

        Box caixa = new Box();

        caixa.setNumero(10);
        caixa.setNumero(3.14);
        System.out.println("valor: "+caixa.getNumero());
    }
}
