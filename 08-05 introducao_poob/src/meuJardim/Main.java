package meuJardim;

public class Main{
    public static void main(String[] args){
        petal petal01=null;

        System.out.println(petal01);

        petal01 = new petal();//instanciação

        System.out.println(petal01);

        petal01.setColor("rosa");

        petal01.printColor();

        petal petal02=new petal();//instancição
        System.out.println(petal02);
        petal02.setColor("white");
        petal02.printColor();

        petal02 = petal01; //petal02 pegou o endereço de memoria de petal01, apontam para o msm lugar
        petal02.printColor();
        petal01.printColor();
    }
}
