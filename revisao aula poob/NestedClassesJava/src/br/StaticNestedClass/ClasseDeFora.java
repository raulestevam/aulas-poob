package br.StaticNestedClass;

public class ClasseDeFora {
	static int valorEstatico=20;
	int valorPrimitivo=30;
	
	
	static class ClasseDeDentroAninhada{
		void display() {
			System.out.println(valorEstatico);
			//System.out.println(valorPrimitivo); //ERRO
		}
		
	}
}
