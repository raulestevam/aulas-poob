package br.Exercicio7;

public class Consultoria implements ICMS{
    double valor;
    public Consultoria (double valor){
        this.valor = valor;
    }
    public double meuICMS(){
        return 0.1 * valor;
    }
}
