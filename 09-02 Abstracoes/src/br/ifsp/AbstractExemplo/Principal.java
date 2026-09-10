package br.ifsp.AbstractExemplo;

public class Principal {

    public static void main(String[] args) {
        Circulo circulo=new Circulo();
        Quadrado quadrado=new Quadrado();

        circulo.setRaio(10);
        circulo.setXY(50, 50);

        circulo.draw();
        quadrado.draw();

        circulo.executar();

    }

}
