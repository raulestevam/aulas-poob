package meuJardim;

public class Flower {
    private String name;
    private Petal petal1;
    private Petal petal2;
    Petal[] petals = new Petal[3];
    int index=0;

    public void addPetal(Petal petal){
        petals[index]=petal;
        index++;
        if(index<2) index=0;
    }

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

    public void printFlowerVector(){
        System.out.print("Flower: ");
        System.out.println(name);
        System.out.println("Petal color: ");
        for (int i=0; i<index; i++){
            petals[i].printColor();
        }
    }
}
