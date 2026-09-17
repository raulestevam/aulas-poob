package br.Ntier_Multilayer.UI;

import br.Ntier_Multilayer.Model.Cliente;

import java.util.List;
import java.util.Scanner;

public class UICadCliente {
    Scanner leitor = new Scanner(System.in);

    public Cliente cadastrarCliente(){
        System.out.println("===== CADASTRO DE CLIENTE =====");
        System.out.println("Digite os dados do cliente: ");

        System.out.println("\n id: ");
        int id = leitor.nextInt();
        System.out.println("\n nome: ");
        String nome = leitor.next();
        System.out.println("\n endereco: ");
        String endereco = leitor.next();

        Cliente cliente = new Cliente();
        cliente.setId(id);
        cliente.setNome(nome);
        cliente.setEndereco(endereco);

        return cliente;
    }

    public void mostrarCliente(Cliente cliente){
        System.out.println("===== MOSTRAR CLIENTE =====");
        System.out.println("id: "+cliente.getId());
        System.out.println("nome: "+cliente.getNome());
        System.out.println("endereco: "+cliente.getEndereco());
        System.out.println("----------------------------");
    }

    public Cliente atualizarCliente(Cliente cliente){
        System.out.println("===== ATUALIZACAO DE CLIENTE =====");
        System.out.println("Digite os dados do cliente: ");

        mostrarCliente(cliente);

        System.out.println("\n id: ");
        int id = leitor.nextInt();
        System.out.println("\n nome: ");
        String nome = leitor.next();
        System.out.println("\n endereco: ");
        String endereco = leitor.next();

        cliente.setId(id);
        cliente.setNome(nome);
        cliente.setEndereco(endereco);

        return cliente;
    }

    public boolean excluirCliente (Cliente cliente){
        System.out.println("===== EXCLUIR CLIENTE =====");
        mostrarCliente(cliente);
        System.out.println("Deseja excluir o cliente? (Y/N)");
        String resposta = leitor.next();

        if(resposta.equals("S")) return true;
        return false;
    }

    public void listarClientes(List<Cliente> lista){
        System.out.println("===== LISTAGEM DE CLIENTES =====");
        for(Cliente c:lista) {
            System.out.println("id: " + c.getId() +
                    "nome: " + c.getNome() +
                    "endereco: " + c.getEndereco());
        }
    }
}
