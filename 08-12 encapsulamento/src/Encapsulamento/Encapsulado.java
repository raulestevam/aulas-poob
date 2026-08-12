package Encapsulamento;

public class Encapsulado {
    private int value;

    public void setValue(int value){
        if (value>10000)
            return;
        this.value=value;
    }
    public int getValue(){
        return value;
    }
}
