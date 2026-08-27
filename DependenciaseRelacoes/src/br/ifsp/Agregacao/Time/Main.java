package br.ifsp.Agregacao.Time;

public class Main {
    public static void main(String[] args){
        Jogador jogador1=new Jogador();
        jogador1.setNome("Jogador 1");
        Jogador jogador2=new Jogador();
        jogador2.setNome("Jogador 2");

        Time time = new Time();
        time.setNome("Barcelona de Boituva");
        time.addJogador(jogador1);
        time.addJogador(jogador2);

        System.out.println("Time: "+time.getJogadores());
    }
}
