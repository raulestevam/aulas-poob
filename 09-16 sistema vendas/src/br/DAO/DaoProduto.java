package br.DAO;

import br.Model.Produto;

import java.util.ArrayList;
import java.util.List;

public class DaoProduto {
    private static final List<Produto> tabelaProduto = new ArrayList<>();

    public void Create(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto não pode ser nulo.");
        }
        tabelaProduto.add(produto);
    }

    public void Delete(Produto produto) {
        tabelaProduto.remove(produto);
    }

    public void Update(Produto produto) {
        Produto produtoBusca = Read(produto.getId());
        if (produtoBusca == null) {
            throw new IllegalArgumentException("Produto não encontrado.");
        }
        produtoBusca.setNome(produto.getNome());
        produtoBusca.setPreco(produto.getPreco());
    }

    public Produto Read(int id) {
        for (Produto produto : tabelaProduto) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public List<Produto> listar() {
        return new ArrayList<>(tabelaProduto);
    }
}
