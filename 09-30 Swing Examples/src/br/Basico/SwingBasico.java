package br.Basico;

import javax.swing.*;
import java.awt.*;

public class SwingBasico {
    public static void main (String[] args){
        JFrame janela = new JFrame("Minha Primeira Janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(640, 480);

        JPanel painel = new JPanel();
        painel.setBackground(Color.white);

        JLabel rotulo = new JLabel("Olá Mundo: ", SwingConstants.CENTER);
        JButton b1 = new JButton("Botao 1");
        b1.addActionListener(e->{
            String nome = JOptionPane.showInputDialog(null, "Qual é sue nome? ",
                    "Cadastro", JOptionPane.QUESTION_MESSAGE);
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Deseja mostrar o nome?", "Pergunta: ", JOptionPane.YES_NO_OPTION);
            if(resposta == JOptionPane.YES_NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Nome: " + nome,
                        "Dados do Usuário", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        JButton b2 = new JButton("Botao 2");
        b2.addActionListener(e->{
            JOptionPane.showMessageDialog(null, "Botao Clicado");
        });

        painel.add(rotulo);
        painel.add(b1);
        painel.add(b2);

        janela.add(painel);
        janela.setVisible(true);
    }
}
