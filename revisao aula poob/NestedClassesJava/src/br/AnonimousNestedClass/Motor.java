package br.AnonimousNestedClass;

public abstract class Motor {
	abstract void iniciar();
}

class Carro{
	public void construirCarro() { //dentro do metodo
		Motor v8=new Motor() {
			@Override
			void iniciar() {
				System.out.println("Ligando");
			}
		};//final de classe
		
	}//fim do metodo
}//fim da classe carro
