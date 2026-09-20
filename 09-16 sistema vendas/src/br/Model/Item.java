package br.Model;

public class Item {
    private int id;
    private Produto produto;
    private int quantidade;

    public Item() {
    }

    public Item(int id, Produto produto, int quantidade) {
        this.id = id;
        this.produto = produto;
        setQuantidade(quantidade);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero.");
        }
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        if (produto == null) {
            return 0.0;
        }
        return produto.getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return "Item{id=" + id +
                ", produto=" + (produto != null ? produto.getNome() : "null") +
                ", quantidade=" + quantidade +
                ", subtotal=" + String.format("%.2f", getSubtotal()) + "}";
    }
}
