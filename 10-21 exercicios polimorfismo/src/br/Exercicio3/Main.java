package br.Exercicio3;

public class Main {
    public Main(){}

    public static void main (String[] args){
        Transporte tran[] = new Transporte[3];
        tran[0] = new Navio();
        tran[1] = new Onibus();
        tran[2] = new Aviao();
            System.out.println("exemplo de aplicação do polimorfismo");
            System.out.println("nomes dos alunos: xxxxx.");
            for(int i = 0; i<tran.length; i++)
                tran[i].exibeDados();//chamada polimorfica do metodo
    }
}
