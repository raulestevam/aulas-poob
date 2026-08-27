package br.ifsp.AssociacaoSimples;

// extends, define a classe em que outra classes terá herança
public class Dependente extends Pessoa{
    public Dependente (String nome) {
        super(nome);
        super.nome = "Joao";
        setNome("Bruno");
        super.metodoImaginario();
    }

    @Override
    public void metodoImaginario(){

    }
    public void metodoNoFilho(){

    }
}
