package br.DAO;

import br.Model.Cliente;
import br.Model.Produto;
import br.Model.Venda;

import java.util.ArrayList;
import java.util.List;

public class DaoVenda {
    int qtd;
    List<Venda> tabelaVenda = new ArrayList();
    Cliente cliente = new Cliente();
    Produto produto = new Produto();
    DaoItem item = new DaoItem(produto, qtd);

    //CRUD
    public void Create(Venda v, Cliente c, DaoItem i){
        v.setCliente(c);
        v.setTabelaItens(i);
        tabelaVenda.add(v);
    }
    public void Delete(Venda venda){
        tabelaVenda.remove(venda);
    }
    public void Update(Venda venda){
        Venda vendaBusca = Read(venda.getId());
        vendaBusca.setId(Venda.getId());
        vendaBusca.setNome(Venda.getNome());
        vendaBusca.setPreco(Venda.getPreco());
    }
    public Venda Read(int id){
        for(Venda c:tabelaVenda){
            if(c.getId()==id) return c;
        }
        return null;
    }

    public List<Venda> listar(){
        return tabelaVenda;
    }
}
