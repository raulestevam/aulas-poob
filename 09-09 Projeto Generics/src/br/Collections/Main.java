package br.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main (String[] args){
        List<String> textos = new ArrayList();

        System.out.println(textos.size());

        //adicionando 10 "Olás" no array
        for(int i=0; i<10; i++)
            textos.add("Ola");

        //for each, acessa todos os elementos da lista e nesta iteração printa os números
        for (String s:textos){
            System.out.println(s);
        }

        //acessando o array só pelo for
        for(int i = 0; i<textos.size(); i++){
            System.out.println(textos.get(i));
            //textos.remove(i);
        }

        //remocao na posicao 0
        textos.remove(0);
        System.out.println(textos.size());

        List<String> subLista = textos.subList(0, 3);

        List<Integer> linkedList = new LinkedList();
        linkedList.add(2);
        //size() printa o tamanho do array
        System.out.println(linkedList.size());
        linkedList.remove(0);
        System.out.println(linkedList.size());
    }
}
