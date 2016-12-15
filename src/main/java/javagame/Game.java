package javagame;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game {
    public static void main(String[] args) {

        JFrame frame = new JFrame("JFrame Example");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("This is a label!");

        JButton button = new JButton();
        button.setText("Press me");

        panel.add(label);
        panel.add(button);

        frame.add(panel);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // TODO: Add shutdown hook? see http://stackoverflow.com/questions/17792939/exiting-an-application-gracefully
        // TODO: Alternatively this: https://docs.oracle.com/javase/8/docs/api/java/awt/doc-files/AWTThreadIssues.html
    }
}
