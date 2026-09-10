package br.DatabaseMemory.BusinessLogicLayer;

import br.DatabaseMemory.Model.Cliente;
import br.DatabaseMemory.UI.UICadCliente;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        //cadastro de cliente
        CadCliente cadCliente = new CadCliente();
        UICadCliente uiCadCliente = new UICadCliente();
        Cliente cliente = uiCadCliente.cadastrarCliente();
        cadCliente.CadastrarCliente(cliente);

        //exclusao de cliente - add no UICadCliente
        System.out.println("===== Excluir Cliente =====");
        uiCadCliente.listarClientes(cadCliente.ListarClientes());

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o id a ser excluido: ");
        int id = leitor.nextInt();

        //manter no Main
        Cliente clienteExclusao = cadCliente.BuscarCliente(id);
        if(clienteExclusao!=null)
            cadCliente.RemoverCliente(clienteExclusao);

        //atualizacao de cliente - add no UICadCliente
        System.out.println("===== Atualizar Cliente =====");
        uiCadCliente.listarClientes(cadCliente.ListarClientes());

        System.out.println("Digite o id a ser atualizado: ");
        id = leitor.nextInt();

        //manter no Main
        Cliente clienteAtualizacao = cadCliente.BuscarCliente(id);
        if(clienteExclusao!=null)
            uiCadCliente.atualizarCliente(clienteAtualizacao);

    }
}
