package Vit.Java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calc extends JFrame implements ActionListener {
    
    JTextField first_input_field;
    JTextField second_input_field;
    JTextField ansField;
    JButton cal;
    
    Calc(){
        setTitle("My calculator");
        setSize(300,150);
        setLayout(new FlowLayout());
        first_input_field = new JTextField(10);
        second_input_field = new JTextField(10);
        ansField = new JTextField(20);
        cal=new JButton("Calculate");
        ansField.setEditable(false);
        add(first_input_field);
        add(second_input_field);
        add(cal);
        add(ansField);

        cal.addActionListener(this);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Calc();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            int num1=Integer.parseInt(first_input_field.getText());
            int num2=Integer.parseInt(second_input_field.getText());
            ansField.setText(num1+num2+"");
        }catch(Exception err){
            ansField.setText("Invalid Input");
        }
    }
}
