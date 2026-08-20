package br.Concessionaria;

import java.util.Scanner;

public class Garagem {
    Carro[] carros = new Carro[100];
    int index = 0;
    Scanner leitor = new Scanner(System.in);

    public Carro createCarro(){
        System.out.println("Digite a marca do carro:");
        String marca = leitor.next();
        System.out.println("Digite a modelo do carro:");
        String modelo = leitor.next();
        System.out.println("Digite a cor do carro:");
        String cor = leitor.next();
        System.out.println("Digite a preco do carro:");
        Float preco = leitor.nextFloat();

        Carro carro = new Carro();
        carro.setId(index);
        carros[index] = carro;
        index++;
        if(index>=100) index =0;
        carro.setMarca(marca);
        carro.setModelo(modelo);
        carro.setCor(cor);
        carro.setPreco(preco);
        return carro;
    }
    public void readCarro(Carro carro){

        System.out.println("--- INFORMAÇÕES DO CARRO ---");
        System.out.println("id:"+carro.getId());
        System.out.println("marca:"+carro.getMarca());
        System.out.println("modelo:"+carro.getModelo());
        System.out.println("cor:"+carro.getCor());
        System.out.println("preco:"+carro.getPreco());
    }
    public void updateCarro(){

    }
    public void deleteCarro(){

    }
    public Carro buscaCarro(int index){
        for(int i=0; i<carros.length; i++){
            Carro carro = carros[i];
            if(carro!=null){
                if(carro.getId()==index)
                    return carro;
            }
        }
        return null;
    }
}
