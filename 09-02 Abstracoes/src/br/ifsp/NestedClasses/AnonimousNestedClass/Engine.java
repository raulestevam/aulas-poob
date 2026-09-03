package br.ifsp.NestedClasses.AnonimousNestedClass;

public abstract class Engine {
    abstract void start();
}

class Car {
    public void buildCar(){
        Engine v8 = new Engine(){
            @Override
            void start() {System.out.println("Starting up");}
        };//final da classe anonima
    }
}
