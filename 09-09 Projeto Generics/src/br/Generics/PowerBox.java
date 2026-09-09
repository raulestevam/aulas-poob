package br.Generics;

//<T> - Generics - tipo genérico de objeto

public class PowerBox<T> {
    private T objeto;

    public void setObjeto (T objeto) {
        this.objeto = objeto;
    }
    public T getObjeto (){
        return objeto;
    }
}
