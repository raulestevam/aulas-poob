import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ExemploBotao {

	public static void main(String[] args) {
		JFrame janela=new JFrame("Exemplo Botao");
		JButton botao=new JButton("Clique aqui");
		
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Teste");
				JOptionPane.showMessageDialog(janela, "Clicado");
			}
		}
		);
		botao.addActionListener(e->JOptionPane.showMessageDialog(janela,"Com lambda"));
		
		janela.add(botao);
		janela.setSize(300, 200);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}

}
