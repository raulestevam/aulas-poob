package br.Layout;

import javax.swing.*;
import javax.swing.plaf.ScrollBarUI;
import java.awt.*;

public class EstudoLayout {
    public static void main (String[] args){
        JFrame frame = new JFrame("Estudo de Layouts");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640,480);

        //configura o layout
        frame.setLayout(new BorderLayout());
        //BorderLayout CENTER NORTH SOUTH EAST WEST

        JPanel painelCentral = new JPanel();
        painelCentral.setBackground(Color.BLUE);
        JPanel painelNorte = new JPanel();
        painelNorte.setBackground(Color.GRAY);
        JPanel painelSul = new JPanel();
        painelSul.setBackground(Color.GREEN);
        JPanel painelLeste = new JPanel();
        painelLeste.setBackground(Color.RED);
        JPanel painelOeste = new JPanel();
        painelOeste.setBackground(Color.WHITE);

        painelOeste.setPreferredSize(new Dimension(90, 0));
        painelLeste.setPreferredSize(new Dimension(90, 0));
        painelSul.setPreferredSize(new Dimension(0, 50));

        painelCentral.setLayout(new GridLayout(2, 2));
        JPanel L1C1 = new JPanel(); L1C1.setBackground(Color.BLACK);
        JPanel L1C2 = new JPanel(); L1C2.setBackground(Color.WHITE);
        JPanel L2C1 = new JPanel(); L2C1.setBackground(Color.CYAN);
        JPanel L2C2 = new JPanel(); L2C2.setBackground(Color.BLACK);

        painelCentral.add(L1C1);
        painelCentral.add(L1C2);
        painelCentral.add(L2C1);
        painelCentral.add(L2C2);

        painelOeste.setLayout(new GridLayout(5, 1));
        JButton b1 = new JButton("B1");
        JButton b2 = new JButton("B2");
        JButton b3 = new JButton("B3");
        JButton b4 = new JButton("B4");
        JButton b5 = new JButton("B5");

        painelOeste.add(b1);
        painelOeste.add(b2);
        painelOeste.add(b3);
        painelOeste.add(b4);
        painelOeste.add(b5);

        JPanel conteudoJSP = new JPanel();
        conteudoJSP.setLayout(new GridLayout(200, 1));
        for(int i = 1; i <= 200; i++){
            JButton botaoaux = new JButton("Botao "+i);
            botaoaux.addActionListener(e->{
                JOptionPane.showMessageDialog(null, "Botao Clicado");
            });
            conteudoJSP.add(botaoaux);
        }
        JScrollPane scrollPane = new JScrollPane(conteudoJSP);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        painelCentral.add(scrollPane);

        frame.add(painelCentral, BorderLayout.CENTER);
        frame.add(painelNorte, BorderLayout.NORTH);
        frame.add(painelSul, BorderLayout.SOUTH);
        frame.add(painelLeste, BorderLayout.EAST);
        frame.add(painelOeste, BorderLayout.WEST);

        //centralizando
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
