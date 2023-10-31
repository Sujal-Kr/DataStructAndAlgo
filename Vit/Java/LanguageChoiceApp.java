package Vit.Java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LanguageChoiceApp extends JFrame implements ActionListener{
    JLabel ques;
    JLabel msg;
    JComboBox<String> lang;
    JButton submit;
    JDialog dialog;

    LanguageChoiceApp(){
        setTitle("Language Choice App");
        setSize(300,150);
        ques = new JLabel("Choose Your Favorite Language");
        lang = new JComboBox<String>();
        submit = new JButton("Submit");
        lang.addItem("Java");
        lang.addItem("Python");
        lang.addItem("C#");
        lang.addItem("C/C++");
        setVisible(true);
        setLayout(new FlowLayout());
        add(ques);
        add(lang);
        add(submit);
        submit.addActionListener(this);
    }
    public static void main(String[] args) {
        new LanguageChoiceApp();
    }
    public void actionPerformed(ActionEvent e){
        dialog = new JDialog(this);
        dialog.setSize(300,150);
        msg=new JLabel("You have selected "+lang.getSelectedItem());
        dialog.add(msg);
        dialog.setVisible(true);
    }
}


