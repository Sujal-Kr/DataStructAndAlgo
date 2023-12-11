package Vit.Java.Project;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
public class Form extends JFrame {
    JLabel name;
    JTextField nameField;
    JLabel pass;
    JTextField passField;
    Form(){
        setTitle("Google Form");
        setSize(300,300);
        setLayout(new BorderLayout());
        JPanel panel = new JPanel(new BorderLayout());
        JPanel panel2 = new JPanel(new BorderLayout());
        System.out.println(panel.getLayout());
        pass = new JLabel("Enter your password");
        passField = new JTextField(10);
        
        panel2.add(pass,BorderLayout.WEST);
        panel2.add(passField,BorderLayout.EAST);
        name=new JLabel("Enter your name");
        nameField=new JTextField(10);
        panel.add(name,BorderLayout.WEST);
        panel.add(nameField,BorderLayout.EAST);
        add(panel, BorderLayout.PAGE_START);
        add(panel2, BorderLayout.AFTER_LAST_LINE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Form();
    }
}
