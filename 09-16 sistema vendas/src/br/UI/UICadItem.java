package br.UI;

import br.Model.Produto;
import java.util.List;
import java.util.Scanner;

public class UICadItem {
    private final Scanner leitor;
    public UICadItem(Scanner leitor){ this.leitor=leitor; }
    public Produto escolherProduto(List<Produto> produtos){
        if(produtos.isEmpty()){ System.out.println("Nenhum produto cadastrado."); return null; }
        for(Produto p:produtos) System.out.printf("%d - %s | R$ %.2f%n",p.getId(),p.getNome(),p.getPreco());
        System.out.print("ID do produto: ");
        int id=Integer.parseInt(leitor.nextLine());
        for(Produto p:produtos) if(p.getId()==id) return p;
        System.out.println("Produto não encontrado."); return null;
    }
    public int lerQuantidade(){ System.out.print("Quantidade: "); return Integer.parseInt(leitor.nextLine()); }
}
