package br.Exercicio1;

import br.Exercicio1.Mamifero.Cachorro;
import br.Exercicio1.Mamifero.Vaca;
import br.Exercicio1.Passaro.BemTeVi;
import br.Exercicio1.Passaro.Passaro;

public class TestaAnimal {
    public static void main (String[] args){
        Vaca leiteira = new Vaca("Malhada");
        System.out.println("Eu sou: "+leiteira.getName());
        System.out.println("Eu falo: ");
        leiteira.talk();
        Cachorro dalmata = new Cachorro("Pongo");
        System.out.println("Eu sou "+dalmata.getName());
        System.out.println("Eu falo: ");
        dalmata.talk();
        Passaro btv = new BemTeVi("Amarelinho");
        System.out.println("Eu sou: "+btv.getName());
        System.out.println("Eu falo: ");
        btv.talk();
    }
}
