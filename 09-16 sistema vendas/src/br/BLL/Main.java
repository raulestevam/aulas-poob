package br.BLL;

import br.Model.*;
import br.UI.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CadCliente cadCliente = new CadCliente();
        CadProduto cadProduto = new CadProduto();
        CadVenda cadVenda = new CadVenda();
        UICadCliente uiCliente = new UICadCliente(leitor);
        UICadProduto uiProduto = new UICadProduto(leitor);
        UICadItem uiItem = new UICadItem(leitor);
        UICadVenda uiVenda = new UICadVenda(leitor);

        while (true) {
            System.out.println("\n===== SISTEMA DE VENDAS =====");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Cadastrar produto");
            System.out.println("4 - Listar produtos");
            System.out.println("5 - Nova venda");
            System.out.println("6 - Listar vendas");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            String opcao = leitor.nextLine();
            try {
                switch (opcao) {
                    case "1":
                        cadCliente.CadastrarCliente(uiCliente.cadastrarCliente());
                        System.out.println("Cliente cadastrado.");
                        break;
                    case "2":
                        uiCliente.listarClientes(cadCliente.ListarClientes());
                        break;
                    case "3":
                        cadProduto.cadastrar(uiProduto.lerNome(), uiProduto.lerPreco());
                        System.out.println("Produto cadastrado.");
                        break;
                    case "4":
                        uiProduto.listar(cadProduto.listar());
                        break;
                    case "5":
                        Cliente cliente = uiVenda.escolherCliente(cadCliente.ListarClientes());
                        if (cliente == null) break;
                        Venda venda = cadVenda.criar(cliente);
                        while (true) {
                            System.out.println("\n1 - Adicionar item");
                            System.out.println("2 - Finalizar venda");
                            System.out.print("Opção: ");
                            String op = leitor.nextLine();
                            if ("1".equals(op)) {
                                Produto produto = uiItem.escolherProduto(cadProduto.listar());
                                if (produto != null) cadVenda.adicionarItem(venda, produto, uiItem.lerQuantidade());
                            } else if ("2".equals(op)) {
                                cadVenda.finalizar(venda);
                                uiVenda.mostrarVenda(venda);
                                break;
                            } else {
                                System.out.println("Opção inválida.");
                            }
                        }
                        break;
                    case "6":
                        uiVenda.listar(cadVenda.listar());
                        break;
                    case "0":
                        leitor.close();
                        return;
                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (RuntimeException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
