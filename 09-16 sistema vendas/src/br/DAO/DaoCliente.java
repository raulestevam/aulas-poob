package br.DAO;

import br.Model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class DaoCliente {
    private static final List<Cliente> tabelaCliente = new ArrayList<>();

    public void Create(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente não pode ser nulo.");
        }
        tabelaCliente.add(cliente);
    }

    public void Delete(Cliente cliente) {
        tabelaCliente.remove(cliente);
    }

    public void Update(Cliente cliente) {
        Cliente clienteBusca = Read(cliente.getId());
        if (clienteBusca == null) {
            throw new IllegalArgumentException("Cliente não encontrado.");
        }
        clienteBusca.setNome(cliente.getNome());
        clienteBusca.setEndereco(cliente.getEndereco());
    }

    public Cliente Read(int id) {
        for (Cliente cliente : tabelaCliente) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    public List<Cliente> listar() {
        return new ArrayList<>(tabelaCliente);
    }
}
