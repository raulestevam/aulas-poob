package br.Generics;

public class Box {
    //abstração de tipo, pode armazenar vários tipos de variável
    private Number numero;

    public void setNumero(Number numero){
        this.numero = numero;
    }
    public Number getNumero (){
        return numero;
    }
}
