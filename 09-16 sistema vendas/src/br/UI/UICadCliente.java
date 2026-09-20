package br.UI;

import br.Model.Cliente;
import java.util.List;
import java.util.Scanner;

public class UICadCliente {
    private final Scanner leitor;
    public UICadCliente(Scanner leitor){ this.leitor=leitor; }
    public Cliente cadastrarCliente(){
        Cliente c=new Cliente();
        System.out.println("\n=== CADASTRO DE CLIENTE ===");
        System.out.print("Nome: "); c.setNome(leitor.nextLine().trim());
        System.out.print("Endereço: "); c.setEndereco(leitor.nextLine().trim());
        return c;
    }
    public void listarClientes(List<Cliente> lista){
        System.out.println("\n=== CLIENTES ===");
        if(lista.isEmpty()){ System.out.println("Nenhum cliente cadastrado."); return; }
        for(Cliente c:lista) System.out.printf("%d - %s | %s%n",c.getId(),c.getNome(),c.getEndereco());
    }
}
