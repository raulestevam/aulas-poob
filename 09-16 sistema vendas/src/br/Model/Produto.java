package br.Model;

public class Produto {
    private int id_produto;
    String nome;
    float preco;

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

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
