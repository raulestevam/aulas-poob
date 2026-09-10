package br.DatabaseMemory.BusinessLogicLayer;

import br.DatabaseMemory.DataAcessObjectCliente.DaoCliente;
import br.DatabaseMemory.Model.Cliente;

public class CadCliente {
    DaoCliente daoCliente;

    public void CadastrarCliente(Cliente cliente){
        if(cliente != null) {
            daoCliente = new DaoCliente();
            daoCliente.Create(cliente);
        }
    }

    public Cliente BuscarCliente(int id){
        daoCliente = new DaoCliente();
        Cliente c = daoCliente.Read(id);
        return c;
    }

    public void RemoverCliente(Cliente cliente){
        daoCliente = new DaoCliente();
        daoCliente.Delete(cliente);
    }

    public void UpdateCliente(Cliente cliente){
        daoCliente = new DaoCliente();
        daoCliente.Update(cliente);
    }
}
