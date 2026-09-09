package br.LocalNestedClass;

public class Carteira {
	void processarPagamento() {
		
		class Transacao{ //classe local ao metodo
			void validar() {
				System.out.println("Transação Validada!");
			}
		}
		
		Transacao tx=new Transacao();
		tx.validar();
	}

}
