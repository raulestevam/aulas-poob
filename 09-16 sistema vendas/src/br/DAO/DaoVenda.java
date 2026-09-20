package br.DAO;

import br.Model.Venda;

import java.util.ArrayList;
import java.util.List;

public class DaoVenda {
    private static final List<Venda> tabelaVenda = new ArrayList<>();

    public void Create(Venda venda) {
        if (venda == null) {
            throw new IllegalArgumentException("Venda não pode ser nula.");
        }
        tabelaVenda.add(venda);
    }

    public void Delete(Venda venda) {
        tabelaVenda.remove(venda);
    }

    public void Update(Venda venda) {
        Venda vendaBusca = Read(venda.getId());
        if (vendaBusca == null) {
            throw new IllegalArgumentException("Venda não encontrada.");
        }
        vendaBusca.setCliente(venda.getCliente());
        vendaBusca.setTabelaItens(venda.getTabelaItens());
    }

    public Venda Read(int id) {
        for (Venda venda : tabelaVenda) {
            if (venda.getId() == id) {
                return venda;
            }
        }
        return null;
    }

    public List<Venda> listar() {
        return new ArrayList<>(tabelaVenda);
    }
}
