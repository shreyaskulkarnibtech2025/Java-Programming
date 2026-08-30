import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SimpleCalculator extends JFrame implements ActionListener {
    JTextField num1Field, num2Field, resultField;
    JButton addButton, subButton;

    SimpleCalculator() {
        setTitle("Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("  First Number:"));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("  Second Number:"));
        num2Field = new JTextField();
        add(num2Field);

        addButton = new JButton("+ Add");
        subButton = new JButton("- Subtract");
        add(addButton);
        add(subButton);

        add(new JLabel("  Result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        addButton.addActionListener(this);
        subButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double res = 0;

            if (e.getSource() == addButton) {
                res = num1 + num2;
            } else if (e.getSource() == subButton) {
                res = num1 - num2;
            }

            resultField.setText(String.valueOf(res));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}