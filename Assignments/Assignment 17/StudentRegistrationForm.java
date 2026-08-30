import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class StudentRegistrationForm extends JFrame {
    JTextField nameField, rollField;
    JButton registerButton;

    StudentRegistrationForm() {
        setTitle("Student Registration");
        setSize(300, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10));

        add(new JLabel("  Student Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("  Roll Number:"));
        rollField = new JTextField();
        add(rollField);

        registerButton = new JButton("Register");
        add(new JLabel());
        add(registerButton);

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String roll = rollField.getText();
                JOptionPane.showMessageDialog(null, "Student Registered!\nName: " + name + "\nRoll No: " + roll);
            }
        });

        setVisible(true);
    }
    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}