package Vit.Java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Form extends JFrame {
    JLabel name;
    JTextField nameField;
    JLabel gender;
    JRadioButton male;
    JRadioButton female;
    JComboBox<String> prof;
    ButtonGroup btn;
    String[] str={"student","teacher","doc"};
    Form(){
        setTitle("Google Form");
        setSize(300,300);
        name=new JLabel("Enter your name");
        name.setBounds(10, 20,100,20);
        nameField=new JTextField(10);
        nameField.setBounds(150, 20,100,20);
        add(name);
        add(nameField);
        btn=new ButtonGroup();
        male=new JRadioButton("male");
        female=new JRadioButton("female");
        btn.add(female);
        btn.add(male);
        JComboBox<String> prof=new JComboBox<>(str);
        prof.addItem("sdkd");
        add(prof);
        
        prof.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"you are a"+prof.getSelectedItem());
            }
        });
        male.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(Form.this,"Yooo!!!");
            }
        });
        female.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"NOooo!!!");
            }
        });
        add(male);
        add(female);
        setLayout(null);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        new Form();
    }
}
