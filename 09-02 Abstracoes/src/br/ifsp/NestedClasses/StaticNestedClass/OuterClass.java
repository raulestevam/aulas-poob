package br.StaticNestedClass;

public class OuterClass {
    static int valorEstatico=20;
    int valorPrimitivo=30;

    static class NestedInnerClass{
        void display(){
            System.out.println(valorEstatico);
            //System.out.println(valorPrmitivo);
        }
    }
}
