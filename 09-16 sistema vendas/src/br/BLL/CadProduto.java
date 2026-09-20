package br.BLL;

import br.DAO.DaoProduto;
import br.Model.Produto;
import java.util.List;

public class CadProduto {
    private final DaoProduto daoProduto = new DaoProduto();

    public Produto cadastrar(String nome, double preco) {
        if (nome == null || nome.trim().isEmpty()) throw new IllegalArgumentException("Nome do produto não pode ser vazio.");
        if (preco <= 0) throw new IllegalArgumentException("Preço do produto deve ser maior que zero.");
        Produto produto = new Produto();
        produto.setId(gerarProximoId());
        produto.setNome(nome.trim());
        produto.setPreco(preco);
        daoProduto.Create(produto);
        return produto;
    }

    public void editar(int id, String nome, double preco) {
        Produto produto = buscar(id);
        if (nome != null && !nome.trim().isEmpty()) produto.setNome(nome.trim());
        if (preco > 0) produto.setPreco(preco);
        daoProduto.Update(produto);
    }

    public void excluir(int id) {
        daoProduto.Delete(buscar(id));
    }

    public Produto buscar(int id) {
        Produto produto = daoProduto.Read(id);
        if (produto == null) throw new IllegalArgumentException("Produto com id " + id + " não encontrado.");
        return produto;
    }

    public List<Produto> listar() { return daoProduto.listar(); }

    private int gerarProximoId() {
        int maiorId = 0;
        for (Produto p : daoProduto.listar()) maiorId = Math.max(maiorId, p.getId());
        return maiorId + 1;
    }
}
