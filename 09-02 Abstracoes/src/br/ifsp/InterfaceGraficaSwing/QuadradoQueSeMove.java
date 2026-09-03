package br.ifsp.ExemploSwing;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class QuadradoQueSeMove extends JPanel implements KeyListener {
    private int x=10, y=10;

    public QuadradoQueSeMove(){
        setBackground(Color.WHITE);
        setFocusable(true);//permite que Panel receba o foco
        addKeyListener(this);
    }

    public static void main (String[] args){
        JFrame frame = new JFrame("Quadrado que se move");
        frame.add(new QuadradoQueSeMove());
        frame.setSize(640, 780);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(x, y, 20, 30);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int tecla = e.getKeyCode();
        if(tecla == KeyEvent.VK_UP){y-=10;};
        if(tecla == KeyEvent.VK_DOWN){y+=10;};
        if(tecla == KeyEvent.VK_LEFT){x-=10;};
        if(tecla == KeyEvent.VK_RIGHT){x+=10;};

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {}
}
