package br.UI;

import br.Model.*;
import java.util.List;
import java.util.Scanner;

public class UICadVenda {
    private final Scanner leitor;
    public UICadVenda(Scanner leitor){ this.leitor=leitor; }
    public Cliente escolherCliente(List<Cliente> clientes){
        if(clientes.isEmpty()){ System.out.println("Nenhum cliente cadastrado."); return null; }
        for(Cliente c:clientes) System.out.printf("%d - %s%n",c.getId(),c.getNome());
        System.out.print("ID do cliente: ");
        int id=Integer.parseInt(leitor.nextLine());
        for(Cliente c:clientes) if(c.getId()==id) return c;
        System.out.println("Cliente não encontrado."); return null;
    }
    public void mostrarVenda(Venda venda){
        System.out.println("\n=== VENDA #"+venda.getId()+" ===");
        System.out.println("Cliente: "+venda.getCliente().getNome());
        for(Item item:venda.getTabelaItens())
            System.out.printf("%d - %s x%d = R$ %.2f%n",item.getId(),item.getProduto().getNome(),item.getQuantidade(),item.getSubtotal());
        System.out.printf("TOTAL: R$ %.2f%n",venda.getTotal());
    }
    public void listar(List<Venda> vendas){ for(Venda v:vendas) mostrarVenda(v); }
}
