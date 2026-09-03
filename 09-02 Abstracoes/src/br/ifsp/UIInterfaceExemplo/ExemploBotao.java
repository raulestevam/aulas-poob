import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploBotao {
    public static void main (String[] args){
        JFrame window = new JFrame("Button Example");
        JButton button = new JButton("Click here");

        button.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Teste");
                    JOptionPane.showMessageDialog(window, "Clicked");
                }
            }
        );

        //lambda function
        button.addActionListener(
                e->JOptionPane.showMessageDialog(window, "Clicked Again"));

        window.add(button);
        window.setSize(300, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
