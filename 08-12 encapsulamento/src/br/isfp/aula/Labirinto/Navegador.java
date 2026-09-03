package br.Labirinto;

public class Navegador {
    Sala salaAtual = null;

    public Navegador(Sala sala){
        this.salaAtual=sala;
    }

    public void navegarNorte(){
        salaAtual=salaAtual.vaiN();
        mostraSalaAtual();
    }
    public void navegarSul(){
        salaAtual=salaAtual.vaiS();
        mostraSalaAtual();
    }
    public void navegarLeste(){
        salaAtual=salaAtual.vaiL();
        mostraSalaAtual();
    }
    public void navegarOeste(){
        salaAtual=salaAtual.vaiO();
        mostraSalaAtual();
    }

    public void mostraSalaAtual(){
        System.out.println(salaAtual);
    }
}
