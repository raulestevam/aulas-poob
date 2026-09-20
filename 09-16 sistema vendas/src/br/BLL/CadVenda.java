package br.BLL;

import br.DAO.DaoVenda;
import br.Model.Cliente;
import br.Model.Produto;
import br.Model.Venda;

import java.util.List;

public class CadVenda {
    private final DaoVenda daoVenda = new DaoVenda();
    private final CadItem cadItem = new CadItem();

    public Venda criar(Cliente cliente) {
        if (cliente == null) throw new IllegalArgumentException("Cliente é obrigatório.");
        Venda venda = new Venda();
        venda.setId(gerarProximoId());
        venda.setCliente(cliente);
        daoVenda.Create(venda);
        return venda;
    }

    public void adicionarItem(Venda venda, Produto produto, int quantidade) {
        cadItem.adicionarProduto(venda, produto, quantidade);
        daoVenda.Update(venda);
    }

    public void removerItem(Venda venda, int idItem) {
        cadItem.removerProduto(venda, idItem);
        daoVenda.Update(venda);
    }

    public Venda buscar(int id) {
        Venda venda = daoVenda.Read(id);
        if (venda == null) throw new IllegalArgumentException("Venda com id " + id + " não encontrada.");
        return venda;
    }

    public List<Venda> listar() {
        return daoVenda.listar();
    }

    public void finalizar(Venda venda) {
        if (venda == null) throw new IllegalArgumentException("Venda não pode ser nula.");
        if (venda.getCliente() == null) throw new IllegalArgumentException("Venda precisa de cliente.");
        if (venda.getTabelaItens().isEmpty()) throw new IllegalArgumentException("Venda precisa de pelo menos um item.");
        daoVenda.Update(venda);
    }

    private int gerarProximoId() {
        int maiorId = 0;
        for (Venda venda : daoVenda.listar()) maiorId = Math.max(maiorId, venda.getId());
        return maiorId + 1;
    }
}
