package br.DAO;

import br.Model.Item;

import java.util.ArrayList;
import java.util.List;

public class DaoItem {
    private static List<Item> tabelaItem = new ArrayList<>();

    public void Create(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item não pode ser nulo.");
        }
        tabelaItem.add(item);
    }

    public void Delete(Item item) {
        tabelaItem.remove(item);
    }

    public void Update(Item item) {
        Item itemBusca = Read(item.getId());
        if (itemBusca == null) {
            throw new IllegalArgumentException("Item não encontrado.");
        }
        itemBusca.setProduto(item.getProduto());
        itemBusca.setQuantidade(item.getQuantidade());
    }

    public Item Read(int id) {
        for (Item item : tabelaItem) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public List<Item> listar() {
        return new ArrayList<>(tabelaItem);
    }
}
