package meuJardim;

public class Main{
    public static void main(String[] args){
        Petal petal01= new Petal();//instanciação
        petal01.setColor("pink");

        Petal petal02=new Petal();//instancição
        petal02.setColor("white");

        Petal petal03=new Petal();//instancição
        petal03.setColor("blue");

        Petal petal04=new Petal();//instancição
        petal04.setColor("purple");

        //petal02 = petal01; //petal02 pegou o endereço de memoria de petal01, apontam para o msm lugar

//        Flower pink = new Flower(petal01, petal02);
        Flower pink = new Flower();
        pink.setName("pink");
        pink.addPetal(petal01);
        pink.addPetal(petal02);

//      Flower blossom = new Flower(petal03, petal04);
        Flower blossom = new Flower();
        blossom.setName("Blossom");
        blossom.addPetal(petal03);
        blossom.addPetal(petal04);

        Garden garden = new Garden();
        garden.setName("Hanging Gardens");
        garden.setFlower(pink, blossom);
        garden.printGarden();
    }
}
