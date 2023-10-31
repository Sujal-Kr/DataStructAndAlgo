package Vit.Java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class QuizApp extends JFrame implements ActionListener {
    JButton show_ans;
    JLabel display_content;

    QuizApp(){
        setTitle("Quiz App");
        setSize(250 , 100);
        setLayout(new FlowLayout());
        setVisible(true);
        show_ans = new JButton("Show Answer");
        display_content = new JLabel("What is the capital of Bharat?");
        add(display_content);
        add(show_ans);
        show_ans.addActionListener(this);

    }
    public static void main(String[] args) {
        new QuizApp();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        display_content.setText("Ans:Delhi");
    }
}
