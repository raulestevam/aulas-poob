package br.Ntier_Multilayer.BusinessLogicLayer;

import br.Ntier_Multilayer.DataAcessObjectCliente.DaoCliente;
import br.Ntier_Multilayer.Model.Cliente;

import java.util.List;

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

    public List<Cliente> ListarClientes(){
        daoCliente = new DaoCliente();
        return daoCliente.listar();
    }

}
