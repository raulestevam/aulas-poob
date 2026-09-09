package br.InnerNestedClass;

import br.InnerNestedClass.ClasseDeFora.ClasseEmbutida;

public class Principal {

	public static void main(String[] args) {
		ClasseDeFora cf=new ClasseDeFora();
		ClasseEmbutida cd=cf.new ClasseEmbutida();
		cd.display();

	}

}
