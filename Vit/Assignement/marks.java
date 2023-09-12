package Vit.Assignement;
import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String grade="";
        System.out.println("Enter Your Score");
        int score=in.nextInt();
        if(score>=90&&score<=100) {
            grade="A";
        }
        else if(score>=80&&score<=89){
            grade="B";
        }
        else if(score>=70&&score<=79){
            grade="C";
        }
        else if(score>70&&score<=0){
            grade="Fail";
        }
        else{
            System.out.println("Invalid Input");
        }
        System.out.println("Your Grade: " + grade);
        in.close();

    }
    

}
