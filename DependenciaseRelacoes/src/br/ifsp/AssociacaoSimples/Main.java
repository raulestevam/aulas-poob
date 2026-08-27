package br.ifsp.AssociacaoSimples;

public class Main {
    public static void main(String[] args){
        Dependente filho = new Dependente("Joao");
        filho.setNome("Lucas");

        Funcionario pai = new Funcionario("Davi");
        pai.setNome("Mateus");
        pai.setDependente(filho);

        Pessoa p = new Pessoa("Pessoa P");
        Pessoa x = new Dependente("Julia");
        //mostrarPessoa(p);
        mostrarPessoa(filho);
        //mostrarPessoa(pai);
    }

    //polimorfismo dinamico
    public static void mostrarPessoa(Pessoa pessoa){
        System.out.println(pessoa.getNome());
        pessoa.metodoImaginario();
    }
}
