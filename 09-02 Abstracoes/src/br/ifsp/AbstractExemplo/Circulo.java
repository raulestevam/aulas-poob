package br.ifsp.AbstractExemplo;

public class Circulo {
    private int raio;
    private int x,y;

    public void setRaio(int raio){
        this.raio = raio;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(){
        System.out.println("Desenhando Circulo");
    }
}
