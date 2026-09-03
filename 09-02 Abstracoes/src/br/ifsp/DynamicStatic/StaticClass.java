package br.ifsp.DynamicStatic;

public class StaticClass {
    public static int valor = 0;

    public static void incrementa(){
        valor++;
        System.out.println("valor incrementando: "+valor);
    }
}
