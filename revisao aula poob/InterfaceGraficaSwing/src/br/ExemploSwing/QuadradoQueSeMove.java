package br.ExemploSwing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;


public class QuadradoQueSeMove extends JPanel implements KeyListener{
	private int x=10,y=10;
	int passos=0, delta=-5;
	
	
	public QuadradoQueSeMove() {
		setBackground(Color.WHITE);
		setFocusable(true); //permite que panel receba foco
		addKeyListener(this);
		
		
	}

	public static void main(String[] args) {
		JFrame frame=new JFrame("Quadrado Que Se Move");
		frame.add(new QuadradoQueSeMove());
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		int tecla=e.getKeyCode();
		if(tecla==KeyEvent.VK_UP) {y-=10;}
		if(tecla==KeyEvent.VK_DOWN) {y+=10;}
		if(tecla==KeyEvent.VK_LEFT) {x-=10;}
		if(tecla==KeyEvent.VK_RIGHT) {x+=10;}
		if(tecla==KeyEvent.VK_SPACE) {passos=10;}
		
		if(passos>0) {
			y=y+delta;
			passos--;
			delta++;

		}
		
		repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent e) {}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.BLUE);
		g.fillRect(x, y, 20, 30);
	}
	
	
}