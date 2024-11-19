import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exp8 extends JFrame implements ActionListener {
    // Form components
    private JLabel nameLabel, emailLabel, passwordLabel, genderLabel;
    private JTextField nameField, emailField;
    private JPasswordField passwordField;
    private JRadioButton maleButton, femaleButton;
    private JButton submitButton;
    private ButtonGroup genderGroup;

    public exp8() {
        // Frame properties
        setTitle("Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Initialize components
        nameLabel = new JLabel("Name:");
        nameField = new JTextField();

        emailLabel = new JLabel("Email:");
        emailField = new JTextField();

        passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        genderLabel = new JLabel("Gender:");
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        
        // Group the radio buttons
        genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(passwordLabel);
        add(passwordField);
        add(genderLabel);
        add(maleButton);
        add(femaleButton);
        add(submitButton);

        setVisible(true);
    }

    // Handle button click event
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());
        String gender = maleButton.isSelected() ? "Male" : (femaleButton.isSelected() ? "Female" : "Not specified");

        JOptionPane.showMessageDialog(this, "Registration Details:\n"
                + "Name: " + name + "\n"
                + "Email: " + email + "\n"
                + "Password: " + password + "\n"
                + "Gender: " + gender);
    }

    public static void main(String[] args) {
        new exp8();
    }
}
