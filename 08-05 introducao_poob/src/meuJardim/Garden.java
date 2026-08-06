package meuJardim;

public class Garden {
    String name="";
    private Flower flower1, flower2;

    public Garden(){

    }// construtor vazio, jardim não depende de flor pra existir

    public void setName(String name){
        this.name=name;
    }
    public void setFlower(Flower flower1, Flower flower2){
        this.flower1=flower1;
        this.flower2=flower2;
    }
    public void printGarden(){
        System.out.println(name);
        flower1.printFlower();
        flower2.printFlower();
    }
}
