package br.InnerNestedClass;

public class ClasseDeFora {
	private String mensagem="Ola mundo";
	
	class ClasseEmbutida{
		void display() {
			System.out.println(mensagem);
		}
	}
	
	public void teste() {
		ClasseEmbutida ce=new ClasseEmbutida();
	}

}
