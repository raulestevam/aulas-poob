package br.BLL;

import br.DAO.DaoCliente;
import br.Model.Cliente;
import java.util.List;

public class CadCliente {
    private final DaoCliente daoCliente = new DaoCliente();

    public void CadastrarCliente(Cliente cliente) {
        if (cliente == null || cliente.getNome() == null || cliente.getNome().trim().isEmpty())
            throw new IllegalArgumentException("Cliente inválido.");
        if (cliente.getId() <= 0) cliente.setId(gerarProximoId());
        daoCliente.Create(cliente);
    }

    public Cliente BuscarCliente(int id) {
        return daoCliente.Read(id);
    }

    public void RemoverCliente(Cliente cliente) {
        if (cliente != null) daoCliente.Delete(cliente);
    }

    public void UpdateCliente(Cliente cliente) {
        if (cliente == null) throw new IllegalArgumentException("Cliente inválido.");
        daoCliente.Update(cliente);
    }

    public List<Cliente> ListarClientes() {
        return daoCliente.listar();
    }

    private int gerarProximoId() {
        int maior = 0;
        for (Cliente c : daoCliente.listar()) maior = Math.max(maior, c.getId());
        return maior + 1;
    }
}
