package br.BLL;

import br.DAO.DaoItem;
import br.Model.Item;
import br.Model.Produto;
import br.Model.Venda;

import java.util.List;

public class CadItem {
    private final DaoItem daoItem = new DaoItem();

    public Item adicionarProduto(Venda venda, Produto produto, int quantidade) {
        if (venda == null || produto == null) throw new IllegalArgumentException("Venda e produto são obrigatórios.");
        if (quantidade <= 0) throw new IllegalArgumentException("Quantidade deve ser maior que zero.");

        for (Item item : venda.getTabelaItens()) {
            if (item.getProduto().getId() == produto.getId()) {
                item.setQuantidade(item.getQuantidade() + quantidade);
                if (daoItem.Read(item.getId()) == null) daoItem.Create(item);
                else daoItem.Update(item);
                return item;
            }
        }

        Item novo = new Item(gerarProximoId(), produto, quantidade);
        venda.getTabelaItens().add(novo);
        daoItem.Create(novo);
        return novo;
    }

    public void removerProduto(Venda venda, int idItem) {
        if (venda == null) throw new IllegalArgumentException("Venda não pode ser nula.");
        Item item = buscar(idItem);
        venda.getTabelaItens().removeIf(i -> i.getId() == idItem);
        daoItem.Delete(item);
    }

    public Item buscar(int id) {
        Item item = daoItem.Read(id);
        if (item == null) throw new IllegalArgumentException("Item com id " + id + " não encontrado.");
        return item;
    }

    public List<Item> listar() {
        return daoItem.listar();
    }

    public double calcularTotal(Venda venda) {
        if (venda == null) throw new IllegalArgumentException("Venda não pode ser nula.");
        return venda.getTotal();
    }

    private int gerarProximoId() {
        int maiorId = 0;
        for (Item item : daoItem.listar()) maiorId = Math.max(maiorId, item.getId());
        return maiorId + 1;
    }
}
