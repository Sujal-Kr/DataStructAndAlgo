package Vit.Java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickMe {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Swing Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create a panel to hold form components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        // Create form fields and labels
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameTextField = new JTextField(20);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailTextField = new JTextField(20);

        JLabel messageLabel = new JLabel("Message:");
        JTextArea messageTextArea = new JTextArea(5, 20);
        JScrollPane messageScrollPane = new JScrollPane(messageTextArea);

        // Create a submit button
        JButton submitButton = new JButton("Submit");

        // Create a result label to display form data
        JLabel resultLabel = new JLabel();

        // Add an ActionListener to the Submit button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String email = emailTextField.getText();
                String message = messageTextArea.getText();

                // Display the form data
                String result = "Name: " + name + "<br>Email: " + email + "<br>Message: " + message;
                resultLabel.setText("<html><p>" + result + "</p></html>");
            }
        });

        // Add form components to the panel
        panel.add(nameLabel);
        panel.add(nameTextField);
        panel.add(emailLabel);
        panel.add(emailTextField);
        panel.add(messageLabel);
        panel.add(messageScrollPane);
        panel.add(submitButton);

        // Create a result panel to display form data
        JPanel resultPanel = new JPanel();
        resultPanel.add(resultLabel);

        // Add the form panel and result panel to the main frame
        frame.add(panel, BorderLayout.NORTH);
        frame.add(resultPanel, BorderLayout.CENTER);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
