package br.ifsp.DynamicStatic;

public class Main {

    public static void main (String[] args){
        StaticClass.incrementa();

        DynamicClass sc1 = new DynamicClass();
        DynamicClass sc2 = new DynamicClass();
        DynamicClass sc3 = new DynamicClass();
        sc1.incrementa();
        sc2.incrementa();
        sc3.incrementa();
    }

}
