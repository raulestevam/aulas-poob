package br.Exercicio1.Passaro;

import br.Exercicio1.Animal;

public abstract class Passaro extends Animal {
    public Passaro (String n){
        super(n);
    }
    public void talk(){
        System.out.println("Piu Piu");
    }
}
