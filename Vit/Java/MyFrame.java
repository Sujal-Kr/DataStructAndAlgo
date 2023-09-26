package Vit.Java;

import javax.swing.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener{
    MyFrame(){
        setTitle("Button Example");
        setSize(300, 200);
        JButton clickButton = new JButton("Click Me");
        add(clickButton);
        clickButton.addActionListener(this);
        setVisible(true);
        clickButton.setBounds(100, 75, 100, 25); 
        setLayout(null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked!");
    }
    
    public static void main(String[] args) {
        new MyFrame();
    }
}
