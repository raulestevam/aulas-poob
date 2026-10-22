package br.Exercicio7;

public class Carro implements ICMS{
    String fabricante, modelo;
    int ano, vel_max, peso;
    float preco; int num_rodas = 4;
    int num_portas;
    public double meuICMS(){
        return 0.17 * preco;
    }
}
