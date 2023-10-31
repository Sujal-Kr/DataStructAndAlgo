package Vit.Assignement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyFrame extends JFrame implements ActionListener{
    JButton btn;
    MyFrame() {
        setTitle("My Frame");
        setSize(300, 150);
        setLayout(new FlowLayout());
        setVisible(true);
        btn=new JButton("Try Me!!");
        btn.addActionListener(this);
        add(btn);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("Button pressed successfully");
    }
    public static void main(String[] args) {
        new MyFrame();
    }
}
