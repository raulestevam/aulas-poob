package br.Default;

import java.util.Arrays;

public class OrdenadorDecrescente implements Ordenador{
    @Override
    public void execute(int[] valores) {
        Arrays.sort(valores);
        int[] aux = new int[valores.length];
        for (int i = 0; i< valores.length; i++){
            aux[(valores.length-1)-i]=valores[i];
        }
        for (int i = 0; i< valores.length; i++)
            valores[i]=aux[i];
    }
}
