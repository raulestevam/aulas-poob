package br.DAO;

import br.Model.Produto;

import java.util.ArrayList;
import java.util.List;

public class DaoItem {
    private Produto produto;
    private Number qtd;
    private List<DaoItem> itens = new ArrayList<DaoItem>();

    public DaoItem(Produto produto, Number qtd) {
        this.produto = produto;
        this.qtd = qtd;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Number getQtd() {
        return qtd;
    }

    public void setQtd(Number qtd) {
        this.qtd = qtd;
    }

    public void addItens(Produto produto){
        itens.forEach(item -> {
            if(item.produto.getId() == produto.getId()){
                item.setQtd(item.getQtd()+1);
                return;
            }
        });
        itens.add();
    }
}
