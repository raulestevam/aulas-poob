package meuJardim;

public class KnoledgeClass {
    int[] values = new int[3];//declarando vetores
    double[] val = {1.2, 2.3, 3.4};//outra forma de declarar
    Petal[] petals = new Petal[3];

    public void fillValues(){
        petals[0]=new Petal();
        petals[1]=new Petal();
        petals[2]=new Petal();
        values[0]=10;
        values[1]=20;
        values[2]=30;

        for (int i=0; i<3; i++){
            values[i]+=1;
            System.out.println(values[i]);
        }
    }

    public static void main(String[] args){
        KnoledgeClass Kn = new KnoledgeClass();
        Kn.fillValues();
    }
}
