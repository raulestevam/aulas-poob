package br.Model;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private int id;
    private Cliente cliente;
    private List<Item> tabelaItens = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getTabelaItens() {
        return tabelaItens;
    }

    public void setTabelaItens(List<Item> tabelaItens) {
        this.tabelaItens = tabelaItens != null ? tabelaItens : new ArrayList<>();
    }

    public double getTotal() {
        double total = 0.0;
        for (Item item : tabelaItens) {
            total += item.getSubtotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Venda{id=" + id +
                ", cliente=" + (cliente != null ? cliente.getNome() : "null") +
                ", itens=" + tabelaItens.size() +
                ", total=" + String.format("%.2f", getTotal()) + "}";
    }
}
