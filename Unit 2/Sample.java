import javax.swing.*;

public class Sample {
    public static void main(String[] args) {
        // Create frames for panel A and panel B
        JFrame frameA = new JFrame("Panel A");
        // JFrame frameB = new JFrame("Panel B");

        // Create buttons for panel A and panel B
        JButton buttonA = new JButton("A");
        JButton buttonB = new JButton("B");

        // Create panels to hold the buttons
        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();

        // Add button A to panel A
        panelA.add(buttonA);

        // Add button B to panel B
        panelB.add(buttonB);

        // Add panel A to frame A and set frame properties
        frameA.add(panelA);
        frameA.setSize(200, 100); // Set frame size
        frameA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set close operation
        frameA.setVisible(true); // Make frame visible

        // Add panel B to frame B and set frame properties
        frameA.add(panelB);
        frameA.setSize(200, 100); // Set frame size
        frameA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set close operation
        frameA.setVisible(true); // Make frame visible
    }
}
