package br.ifsp.NestedClasses.InnerNestedClass;

public class OuterClass {
    private String msg = "Hello World!";

    class EmbedClass {
        void display(){
            System.out.println(msg);
        }
    }
}
