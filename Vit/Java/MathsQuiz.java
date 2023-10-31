package Vit.Java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MathsQuiz extends JFrame {
    JLabel ques;
    JLabel ans;
    JButton submit;
    JButton genrate;
    JTextField input;
    int res;

    MathsQuiz(){
        setTitle("Maths Quiz");
        setSize(300,150);
        ques=new JLabel("What is num1 + num2?");
        ans=new JLabel();
        submit=new JButton("Submit");
        genrate=new JButton("Generate Question");
        input=new JTextField(10);
        input.setAlignmentX(5);
        add(ques);
        add(input);
        add(genrate);
        add(submit);
        add(ans);
        setLayout(new FlowLayout());
        setVisible(true);
        genrate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int num1=(int)(Math.random()*100);
                int num2=(int)(Math.random()*100);
                ques.setText("What is "+num1 +" + "+num2+"?");
                res=num1+num2;
            }
        });
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try{    
                    int your_ans=Integer.parseInt(input.getText());
                    if(res==your_ans){
                        ans.setText("Bro thinks he is ramanujan 🗿🗿");
                    }
                    else{
                        ans.setText("You are a disgrace to your family 😒");
                    }
                }catch(Exception err){
                    ans.setText("My grandmother writes better code than you!!!");
                }
            }
        });
    }
    
    public static void main(String[] args) {
        new MathsQuiz();
    }
}
