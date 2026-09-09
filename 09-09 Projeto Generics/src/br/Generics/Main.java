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

        PowerBox<String> superCaixa1 = new PowerBox<String>();
        superCaixa1.setObjeto("Ola Mundo!");
        System.out.println(superCaixa1.getObjeto());

        PowerBox<Integer> superCaixa2 = new PowerBox<Integer>();
        superCaixa2.setObjeto(67);
        System.out.println(superCaixa2.getObjeto());

        //em herança não declara o tipo do filho
        PowerBox<Double> caixaDouble = new PowerBoxFilha();
        caixaDouble.setObjeto(3.1415);
        System.out.println(caixaDouble.getObjeto());
    }
}
