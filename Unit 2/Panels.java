import java.awt.Color;

import javax.swing.*;

public class Panels {
    public static void main(String[] avi) {
        JFrame  frame = new JFrame();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        p1.setBackground(Color.RED);
        p2.setBackground(Color.BLUE);
        frame.add(p1);frame.add(p2);

        p1.setLayout(null);
        p2.setLayout(null);

        frame.setLayout(null);frame.setSize(400,400);frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
