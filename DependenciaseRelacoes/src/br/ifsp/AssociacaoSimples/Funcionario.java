package br.ifsp.AssociacaoSimples;

public class Funcionario extends Pessoa{
    private Dependente dependente;

    //injeção de dependencia
    public void setDependente (Dependente dependente){
        this.dependente = dependente;
    }

    public Funcionario(String nome){
        super(nome);
    }

}
