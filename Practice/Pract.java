package Practice;
//counting the no of steps till i get zero as THE result.
import java.util.Scanner;
public class Pract{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any two numbers.");
        int a=in.nextInt();
        int b=in.nextInt();
        int diff;
        int count=0;
        while(a!=0||b!=0){
            diff=a-b;
            if(diff<0){
                diff=Math.abs(diff);
                b=diff;
            }
            else if(diff>0){
                a=diff;
            }
            else{
                count++;
                break;
            }
            count++;
        }
        System.out.println(count);
        in.close();
    }
}