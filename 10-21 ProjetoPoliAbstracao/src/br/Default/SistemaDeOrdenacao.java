package br.Default;

public class SistemaDeOrdenacao {
    OrdenadorInterface ordena;
    public void injetaOrdenador (Ordenador ordena){
        this.ordena = ordena;
    }
    public void execute(int[] valores){
        ordena.execute(valores);
        imprime(valores);
    }
    public void imprime(int[] valores){
        for(int i = 0; i<valores.length; i++){
            System.out.println(valores[i]);
        }
    }
}
