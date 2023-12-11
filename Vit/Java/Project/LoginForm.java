package Vit.Java.Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;

public class LoginForm extends JFrame {
    JTextField usernameField;
    JPasswordField passwordField;

    LoginForm() {
        setTitle("Login Form");
        setLayout(new FlowLayout());
        JPanel user_Panel=new JPanel(new BorderLayout());
        JPanel password_Panel=new JPanel(new FlowLayout());
        user_Panel.add(new JLabel("Username"), BorderLayout.WEST);
        user_Panel.add(new JTextField(10),BorderLayout.EAST);
        password_Panel.add(new JLabel("Password"), BorderLayout.WEST);
        password_Panel.add(new JTextField(10),BorderLayout.EAST);
        add(user_Panel);
        add(password_Panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}

