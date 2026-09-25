import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimpleButtonClickApp {
    public static void main(String[] args) {
        // Create the main window
        JFrame frame = new JFrame("Button Click Demo");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Create UI components
        JPanel panel = new JPanel();
        JButton button = new JButton("Click Me!");
        JLabel label = new JLabel("Button has not been clicked.");

        // Attach an event handler using a Java lambda expression
        button.addActionListener(e -> label.setText("Button was clicked!"));

        // Add components to panel and window
        panel.add(button);
        panel.add(label);
        frame.add(panel);

        // Make window visible
        frame.setVisible(true);
    }
}