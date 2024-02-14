import javax.swing.*;
import java.awt.*;
public class SimpleCalculator {
    public static void main(String[] avi){
        
        JFrame frame = new JFrame("Simple Calculator");
        frame.setResizable(false);
        // frame.setLayout(gl);
        frame.setSize(350,450);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel top = new JPanel();
        top.setSize(350,100);

        JPanel buttons = new JPanel();
        buttons.setSize(350,350);

        
        JTextArea area = new JTextArea();
        // GridLayout gl = new GridLayout(5,4);
        JButton b1 = new JButton("");JButton b2 = new JButton("");JButton b3 = new JButton("");JButton b4 = new JButton("/");
        JButton b5 = new JButton("7");JButton b6 = new JButton("8");JButton b7 = new JButton("9");JButton b8 = new JButton("*");
        JButton b9 = new JButton("4");JButton b10 = new JButton("5");JButton b11 = new JButton("6");JButton b12 = new JButton("-");
        JButton b13 = new JButton("1");JButton b14 = new JButton("2");JButton b15 = new JButton("3");JButton b16 = new JButton("+");
        JButton b17 = new JButton("");JButton b18 = new JButton("0");JButton b19 = new JButton(".");JButton b20 = new JButton("=");

        frame.add(area);area.setSize(350, 30);
        frame.add(b1);frame.add(b2);frame.add(b3);frame.add(b4);frame.add(b5);frame.add(b6);frame.add(b7);frame.add(b8);
        frame.add(b9);frame.add(b10);frame.add(b11);frame.add(b12);frame.add(b13);frame.add(b14);frame.add(b15);frame.add(b16);
        frame.add(b17);frame.add(b18);frame.add(b19);frame.add(b20);


        
        
    }
}
