package br.Model;

import br.DAO.DaoItem;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Cliente cliente;
    private List<DaoItem> tabelaItens = new ArrayList<DaoItem>();

    public List<DaoItem> getTabelaItens() {
        return tabelaItens;
    }

    public void setTabelaItens(List<DaoItem> tabelaItens) {
        this.tabelaItens = tabelaItens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
