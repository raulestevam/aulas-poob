package meuJardim;

public class Flower {
    private String name;
    private Petal petal1;
    private Petal petal2;

    public Flower(Petal petal1, Petal petal2){
        this.petal1=petal1;
        this.petal2=petal2;
    }
    public void setName(String name){
        this.name=name;
    }

    public void printFlower(){
        System.out.print("Flower: ");
        System.out.println(name);
        System.out.println("Petal color: ");
        petal1.printColor();
        petal2.printColor();
    }
}
