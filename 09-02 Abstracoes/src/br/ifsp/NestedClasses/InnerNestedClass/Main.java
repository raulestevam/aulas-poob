package br.InnerNestedClass;

import br.InnerNestedClass.OuterClass.EmbedClass;

public class Main {
    public static void main (String[] args){
        OuterClass oc = new OuterClass();
        EmbedClass oe = oc.new EmbedClass();

        oe.display();
    }
}
