package br.DatabaseMemory.DataAcessObjectCliente;

import br.DatabaseMemory.Model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class DaoCliente {
    List<Cliente> tabelaCliente = new ArrayList();

    //CRUD
    public void Create(Cliente cliente){
        tabelaCliente.add(cliente);
    }
    public void Delete(Cliente cliente){
        tabelaCliente.remove(cliente);
    }
    public void Update(Cliente cliente){
        Cliente clienteBusca = Read(cliente.getId());
        clienteBusca.setId(cliente.getId());
        clienteBusca.setNome(cliente.getNome());
        clienteBusca.setEndereco(cliente.getEndereco());
    }

    public Cliente Read(int id){
        for(Cliente c:tabelaCliente){
            if(c.getId()==id) return c;
        }
        return null;
    }
}
