// import javax.swing.*;
// import java.awt.event.*;
// import static java.lang.Integer.parseInt;

// public class Adder extends JFrame implements ActionListener{
//     TextField t1,t2,t3;
//     public void ActionPerformed(ActionEvent)Adder(){
//         int a = parseInt(t1.getText());
//         int b = parseInt(t2.getText());
//         int c = a + b;

//     }
//     public static void main(String[] args) {
//         JFrame frame = new JFrame();
//         JLabel Number1 = new JLabel("Number 1");
//         JLabel Number2 = new JLabel("Number 2");
//         JTextField tf1 = new JTextField();
//         JTextField tf2 = new JTextField();
//         JTextField tf3 = new JTextField();
//         JButton Add = new JButton("Add");
        
//         frame.add(Number1);Number1.setBounds(10,50,60,30);
//         frame.add(Number2);Number2.setBounds(10,90,60,30);

//         frame.add(tf1);tf1.setBounds(90,50,100,30);
//         frame.add(tf2);tf2.setBounds(90,90,100,30);
        
//         frame.add(Add);Add.setBounds(100,130,70,30);
        
//         frame.add(tf3);tf3.setBounds(140,90,100,30);

//         add.ActionListener(this);

//         frame.setLayout(null);frame.setVisible(true);frame.setSize(350,450);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
// }


import javax.swing.*;
import java.awt.event.*;
import static java.lang.Integer.parseInt;

public class Adder extends JFrame implements ActionListener{
    JTextField tf1, tf2, tf3;

    public Adder() {
        JLabel Number1 = new JLabel("Number 1");
        JLabel Number2 = new JLabel("Number 2");
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        JButton Add = new JButton("Add");

        add(Number1); Number1.setBounds(10, 50, 60, 30);
        add(Number2); Number2.setBounds(10, 90, 60, 30);
        add(tf1); tf1.setBounds(90, 50, 100, 30);
        add(tf2); tf2.setBounds(90, 90, 100, 30);
        add(Add); Add.setBounds(100, 130, 70, 30);
        add(tf3); tf3.setBounds(90, 170, 100, 30);

        Add.addActionListener(this);

        setLayout(null);
        setVisible(true);
        setSize(350, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int a = parseInt(tf1.getText());
        int b = parseInt(tf2.getText());
        int c = a + b;
        tf3.setText(Integer.toString(c));
    }

    public static void main(String[] args) {
        new Adder();
    }
}
