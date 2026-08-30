import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BankBalanceCalculator extends JFrame implements ActionListener {
    JTextField initialBalanceField, amountField, currentBalanceField;
    JButton depositButton, withdrawButton;

    BankBalanceCalculator() {
        setTitle("Bank Balance Calculator");
        setSize(350, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("  Initial Balance ($):"));
        initialBalanceField = new JTextField();
        add(initialBalanceField);

        add(new JLabel("  Transaction Amount ($):"));
        amountField = new JTextField();
        add(amountField);

        depositButton = new JButton("Deposit");
        withdrawButton = new JButton("Withdraw");
        add(depositButton);
        add(withdrawButton);

        add(new JLabel("  Current Balance ($):"));
        currentBalanceField = new JTextField();
        currentBalanceField.setEditable(false);
        add(currentBalanceField);

        depositButton.addActionListener(this);
        withdrawButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double balance = Double.parseDouble(initialBalanceField.getText());
            double amount = Double.parseDouble(amountField.getText());

            if (amount < 0) {
                JOptionPane.showMessageDialog(this, "Amount cannot be negative.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (e.getSource() == depositButton) {
                balance += amount;
            } else if (e.getSource() == withdrawButton) {
                if (amount > balance) {
                    JOptionPane.showMessageDialog(this, "Insufficient balance!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                balance -= amount;
            }

            initialBalanceField.setText(String.valueOf(balance));
            currentBalanceField.setText(String.valueOf(balance));
            amountField.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric amounts.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new BankBalanceCalculator();
    }
}