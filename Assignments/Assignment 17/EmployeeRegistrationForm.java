import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EmployeeRegistrationForm extends JFrame {
    JTextField idField, nameField, deptField, salaryField;
    JButton submitButton;

    EmployeeRegistrationForm() {
        setTitle("Employee Registration");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new JLabel("  Employee ID:"));
        idField = new JTextField();
        add(idField);

        add(new JLabel("  Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("  Department:"));
        deptField = new JTextField();
        add(deptField);

        add(new JLabel("  Salary:"));
        salaryField = new JTextField();
        add(salaryField);

        submitButton = new JButton("Submit");
        add(new JLabel());
        add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = idField.getText();
                String name = nameField.getText();
                String dept = deptField.getText();
                String salary = salaryField.getText();

                String details = "--- Employee Details ---\n" +
                                 "ID: " + id + "\n" +
                                 "Name: " + name + "\n" +
                                 "Department: " + dept + "\n" +
                                 "Salary: Rs" + salary;

                JOptionPane.showMessageDialog(null, details, "Employee Info", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new EmployeeRegistrationForm();
    }
}