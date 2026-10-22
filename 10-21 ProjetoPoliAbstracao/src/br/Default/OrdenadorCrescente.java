package br.Default;

import java.util.Arrays;

public class OrdenadorCrescente implements Ordenador{

    @Override
    public void execute(int[] valores) {
        Arrays.sort(valores);
    }
}
