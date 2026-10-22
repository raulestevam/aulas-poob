package br.Exercicio1.Mamifero;

import br.Exercicio1.Animal;

public abstract class Mamifero extends Animal {
    public Mamifero (String n){
        super(n);
    }
    public abstract void talk();
}
