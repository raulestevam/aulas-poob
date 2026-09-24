package br.ThreadSimples;

public class Trabalhador extends Thread{
    String nome;
    int valor;

    public void setDados(String nome, int valor){
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public void run(){
        while (valor<10){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(""+nome+"-> valor ->: "+valor);
            valor++;
        }
    }
}
