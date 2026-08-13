package br.isfp.aula.Encapsulamento;

public class Encapsulado {
    private int value;
    private int[] values;

    //polimorfismo estatico - metodos que se ataptam a cada chamada
    public Encapsulado (int[] val){ //metodo construtor para relacionamento entre objetos
        values=val;
    }

    public Encapsulado(){} //metodo construtor para relacionamento entre objetos sem parâmetros (outros relacionementos)

    //encapsulamento - impede o acesso direto aos atibutos (private) -
    public void setValues(int[] values) {
        this.values = values;
    }

    public int[] getValues() {
        return values;
    }

    public void setValue(int value){
        if (value>10000)
            return;
        this.value=value;
    }
    public int getValue(){
        return value;
    }
}
