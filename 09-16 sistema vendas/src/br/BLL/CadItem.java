package br.BLL;

import br.DAO.DaoItem;
import br.Model.Item;
import br.Model.Produto;
import br.Model.Venda;

import java.util.List;

public class CadItem {
    private DaoItem daoItem = new DaoItem();

    // Adiciona um produto à venda. Se o produto já estiver na venda,
    // soma a quantidade em vez de criar um item duplicado.
    public Item adicionarProduto(Venda venda, Produto produto, int quantidade) {
        if (venda == null) {
            throw new IllegalArgumentException("Venda não pode ser nula.");
        }
        if (produto == null) {
            throw new IllegalArgumentException("Produto não pode ser nulo.");
        }
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero.");
        }

        for (Item item : venda.getTabelaItens()) {
            if (item.getProduto().getId() == produto.getId()) {
                item.setQuantidade(item.getQuantidade() + quantidade);
                daoItem.Update(item);
                return item;
            }
        }

        Item novoItem = new Item(gerarProximoId(), produto, quantidade);
        venda.getTabelaItens().add(novoItem);
        daoItem.Create(novoItem);
        return novoItem;
    }

    public void removerProduto(Venda venda, int idItem) {
        Item item = buscar(idItem);
        venda.getTabelaItens().remove(item);
        daoItem.Delete(item);
    }

    public Item buscar(int id) {
        Item item = daoItem.Read(id);
        if (item == null) {
            throw new IllegalArgumentException("Item com id " + id + " não encontrado.");
        }
        return item;
    }

    public List<Item> listar() {
        return daoItem.listar();
    }

    public float calcularTotal(Venda venda) {
        float total = 0f;
        for (Item item : venda.getTabelaItens()) {
            total += item.getSubtotal();
        }
        return total;
    }

    private int gerarProximoId() {
        int maiorId = 0;
        for (Item i : daoItem.listar()) {
            if (i.getId() > maiorId) {
                maiorId = i.getId();
            }
        }
        return maiorId + 1;
    }
}