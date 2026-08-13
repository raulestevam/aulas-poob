
package br.isfp.aula.Encapsulamento;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        int[] valuesTri = {5,6,7};

        Encapsulado pacote = new Encapsulado();
        pacote.setValues(valuesTri); //push messages

        Encapsulado pacoteFull = new Encapsulado();

        int[] vector = pacoteFull.getValues();//pull messages

        Scanner leitor = new Scanner(System.in);//objeto que recebe inputs do teclado

        //next() interrompe o programa e espera um retono do user
        System.out.println("Nome: ");
        String name = leitor.next(); //lê uma string
        System.out.println("Numero: ");
        int value = leitor.nextInt(); // lê um inteiro
        System.out.println("Numero decimal: ");
        double value1 = leitor.nextDouble(); // lê um double
        System.out.println("Valor Byte: ");
        byte value2 = leitor.nextByte(); // lê um byte

        System.out.println("Nome: "+name+
                "\nValor:"+value+
                "\nValor Double:"+value1+
                "\nValor Byte:"+value2+);
        leitor.close();
        //fecha o leitor
    }
}