package br.ifsp.Agregacao.Time;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;

    List<Jogador> jogadores = new ArrayList<>();

    public void addJogador(Jogador jogador){
        jogadores.add(jogador);
    }

    public String getJogadores(){
        String relatorio="";
        for(Jogador jogador:jogadores){
            relatorio+=""+jogador.getNome()+"\n";
        }
        for (int i=0; i<jogadores.size();i++){
            Jogador jogador=jogadores.get(i);
            relatorio+=""+jogador.getNome()+"\n";
        }
        return relatorio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
