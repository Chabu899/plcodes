import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exp9 extends JFrame implements ActionListener {
    private JLabel nameLabel, accountNumberLabel, accountTypeLabel, depositLabel;
    private JTextField nameField, accountNumberField, depositField;
    private JComboBox<String> accountTypeComboBox;
    private JButton submitButton;

    public exp9() {
        setTitle("Bank Account Creation Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Initialize components
        nameLabel = new JLabel("Name:");
        nameField = new JTextField();

        accountNumberLabel = new JLabel("Account Number:");
        accountNumberField = new JTextField();

        accountTypeLabel = new JLabel("Account Type:");
        String[] accountTypes = { "Savings", "Current", "Fixed Deposit" };
        accountTypeComboBox = new JComboBox<>(accountTypes);

        depositLabel = new JLabel("Initial Deposit:");
        depositField = new JTextField();

        submitButton = new JButton("Create Account");
        submitButton.addActionListener(this);

        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(accountNumberLabel);
        add(accountNumberField);
        add(accountTypeLabel);
        add(accountTypeComboBox);
        add(depositLabel);
        add(depositField);
        add(submitButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Retrieve input values
        String name = nameField.getText();
        String accountNumber = accountNumberField.getText();
        String accountType = (String) accountTypeComboBox.getSelectedItem();
        String deposit = depositField.getText();

        // Basic validation
        if (name.isEmpty() || accountNumber.isEmpty() || deposit.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill out all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            double initialDeposit = Double.parseDouble(deposit);

            // Display confirmation message
            JOptionPane.showMessageDialog(this, "Account Created Successfully!\n"
                    + "Name: " + name + "\n"
                    + "Account Number: " + accountNumber + "\n"
                    + "Account Type: " + accountType + "\n"
                    + "Initial Deposit: $" + initialDeposit);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid deposit amount. Please enter a numeric value.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new exp9();
    }
}
