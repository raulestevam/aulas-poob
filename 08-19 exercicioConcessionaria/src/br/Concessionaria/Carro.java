package br.Concessionaria;

public class Carro {
    private int  id;
    private String marca;
    private String modelo;
    private String cor;
    private Float preco;

    public Carro(){}

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }
    public void setPreco(Float preco){
        this.preco = preco;;
    }
    public Float getPreco(){
        return preco;
    }
}
