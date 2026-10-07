package br.JanelasMDI;

import javax.sound.midi.SysexMessage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MDIComponentes extends JInternalFrame {
    public MDIComponentes (String titulo){
        super(titulo, true, true, true, true);
        setSize(200, 200);
        setLayout(new BorderLayout());

        JPanel painel = new JPanel();
        MouseAdapter ma = new MouseAdapter() {
            public void mouseClicked(MouseEvent evt){
                System.out.println("Mouse Clicado");
            }
            public void MouseMoved(MouseEvent evt){
                System.out.println("X: "+evt.getX()+"Y: "+evt.getY());
            }
        };
        painel.addMouseListener(ma);
        painel.addMouseMotionListener(ma);
        add(painel, BorderLayout.CENTER);
    }
}
