package br.DAO;

import br.Model.Produto;

import java.util.ArrayList;
import java.util.List;

public class DaoProduto {
    List<Produto> tabelaProduto = new ArrayList();

    //CRUD
    public void Create(Produto Produto){
        tabelaProduto.add(Produto);
    }
    public void Delete(Produto Produto){
        tabelaProduto.remove(Produto);
    }
    public void Update(Produto Produto){
        Produto ProdutoBusca = Read(Produto.getId());
        ProdutoBusca.setId(Produto.getId());
        ProdutoBusca.setNome(Produto.getNome());
        ProdutoBusca.setPreco(Produto.getPreco());
    }
    public Produto Read(int id){
        for(Produto c:tabelaProduto){
            if(c.getId()==id) return c;
        }
        return null;
    }

    public List<Produto> listar(){
        return tabelaProduto;
    }
}
