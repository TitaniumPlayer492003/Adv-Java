import javax.swing.*;
// import java.awt.*;
public class SimpleLoginPage{
    public static void main(String[] avi) {
        JFrame frame = new JFrame("Login Page");
        JLabel user_label = new JLabel("Username:");JTextField username = new JTextField();
        JLabel pass_label = new JLabel("Password:");JPasswordField password = new JPasswordField();
        JButton login_button = new JButton("Login");
        JCheckBox cb = new JCheckBox();JLabel rememberme = new JLabel("Keep me logged in");

        // JPanel panel = new JPanel(new GridLayout(4, 2));

        frame.add(user_label);user_label.setBounds(250,150,70,25);
        frame.add(username);username.setBounds(320, 150, 200, 25);
        
        frame.add(pass_label);pass_label.setBounds(250, 200, 70, 25);
        frame.add(password);password.setBounds(320, 200, 200, 25);
        
        frame.add(cb);cb.setBounds(340, 231,20,20);
        frame.add(rememberme);rememberme.setBounds(360, 230, 170, 25);
         
        frame.add(login_button);login_button.setBounds(362,270,75,30);
        
        frame.setLayout(null);frame.setSize(800, 450);frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
