package br.UI;

import br.Model.Produto;
import java.util.List;
import java.util.Scanner;

public class UICadProduto {
    private final Scanner leitor;
    public UICadProduto(Scanner leitor){ this.leitor=leitor; }
    public String lerNome(){ System.out.print("Nome do produto: "); return leitor.nextLine().trim(); }
    public double lerPreco(){ System.out.print("Preço: "); return Double.parseDouble(leitor.nextLine().replace(",", ".")); }
    public void listar(List<Produto> produtos){
        System.out.println("\n=== PRODUTOS ===");
        if(produtos.isEmpty()){ System.out.println("Nenhum produto cadastrado."); return; }
        for(Produto p:produtos) System.out.printf("%d - %s | R$ %.2f%n",p.getId(),p.getNome(),p.getPreco());
    }
}
