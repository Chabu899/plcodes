import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exp7 extends JFrame implements ActionListener {
    // Declare components
    Label heightLabel, weightLabel, resultLabel;
    TextField heightField, weightField;
    Button calculateButton;
    TextArea resultArea;

    // Constructor to set up the GUI
    public exp7() {
        // Set layout
        setLayout(new FlowLayout());

        // Initialize components
        heightLabel = new Label("Enter Height (in meters): ");
        weightLabel = new Label("Enter Weight (in kg): ");
        resultLabel = new Label("BMI Result: ");
        heightField = new TextField(10);
        weightField = new TextField(10);
        calculateButton = new Button("Calculate BMI");
        resultArea = new TextArea(3, 30);
        resultArea.setEditable(false);

        // Add components to the frame
        add(heightLabel);
        add(heightField);
        add(weightLabel);
        add(weightField);
        add(calculateButton);
        add(resultLabel);
        add(resultArea);

        // Add action listener to the button
        calculateButton.addActionListener(this);

        // Set frame properties
        setTitle("BMI Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Action handling for button click
    public void actionPerformed(ActionEvent e) {
        try {
            // Get height and weight from the text fields
            double height = Double.parseDouble(heightField.getText());
            double weight = Double.parseDouble(weightField.getText());

            // Check for valid, non-zero height and weight values
            if (height <= 0 || weight <= 0) {
                resultArea.setText("Height and weight must be positive values.");
                return;
            }

            // Calculate BMI
            double bmi = weight / (height * height);

            // Display result
            resultArea.setText("Your BMI is: " + String.format("%.2f", bmi) + "\n");

            // Categorize the result
            if (bmi < 18.5) {
                resultArea.append("Category: Underweight");
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                resultArea.append("Category: Normal weight");
            } else if (bmi >= 25 && bmi <= 29.9) {
                resultArea.append("Category: Overweight");
            } else {
                resultArea.append("Category: Obese");
            }
        } catch (NumberFormatException ex) {
            resultArea.setText("Please enter valid numbers for height and weight.");
        }
    }

    public static void main(String[] args) {
        new exp7();
    }
}
