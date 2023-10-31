package Vit.Java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Copy extends JFrame implements ActionListener {
    JTextField src;
    JTextField des;
    JButton click;
    Copy(){
        setTitle("Copy");
        setSize(300,150);
        setLayout(new FlowLayout());
        src=new JTextField(20);
        des=new JTextField(20);
        click=new JButton("Copy");
        setVisible(true);
        add(src);
        add(des);
        add(click);
        click.addActionListener(this);
    }
    public static void main(String[] args) {
        new Copy();

    }
    @Override
    public void actionPerformed(ActionEvent e){
        String str=src.getText();
        des.setText(str);
    }
}