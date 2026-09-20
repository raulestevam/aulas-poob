package br.Model;

public class Produto {
    private int id_produto;
    String nome;
    double preco;

    public int getId() {
        return id_produto;
    }

    public void setId(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
