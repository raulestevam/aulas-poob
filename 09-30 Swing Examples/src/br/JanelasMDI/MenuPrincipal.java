package br.JanelasMDI;

import javax.swing.*;
import java.awt.*;

public class MenuPrincipal extends JFrame{
    private JDesktopPane desktopPane;

    public MenuPrincipal(){
        setTitle("Janela Principal");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        desktopPane = new JDesktopPane();
        add(desktopPane, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuModulos = new JMenu("Módulos");
        JMenuItem menuItem = new JMenuItem("Abrir Janela");

        menuItem.addActionListener(e->{
            JanelaMDI janela = new JanelaMDI("Janelinha");
            janela.setVisible(true);
            desktopPane.add(janela);
        });

        JMenuItem menuItem2 = new JMenuItem("Abrir Janela Componentes");
        menuItem2.addActionListener(e->{
            MDIComponentes janela = new MDIComponentes("Janela de Componentes");
            janela.setVisible(true);
            desktopPane.add(janela);
        });

        menuModulos.add(menuItem);
        menuModulos.add(menuItem2);
        menuBar.add(menuModulos);
        setJMenuBar(menuBar);
    }

    public static void main (String[] args){
        EventQueue.invokeLater(()-> {
            MenuPrincipal mp = new MenuPrincipal();
            mp.setVisible(true);
        });
    }
}
