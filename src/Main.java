import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Main {
    public static void main(String[] args) {
        System.out.println("yo");

        //1. Create the frame.
        JFrame window = new JFrame("window test");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel text = new JLabel("hola gamers", SwingConstants.CENTER);
        text.setPreferredSize(new Dimension(300, 100));
        window.getContentPane().add(text, BorderLayout.CENTER);

        window.setLocationRelativeTo(null);
        window.pack();
        window.setVisible(true);
    }
}