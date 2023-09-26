package Vit.Dsa;
import java.util.*;
public class EvaluatePostix {
    public static void main(String[] args) {
        String str="23+6*5+89+/";
        String exp="623+-382/+*2^3+";
        System.out.println(solution(str));
    }

    public static int solution(String str) {
        Stack<Integer> x=new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char temp=str.charAt(i);
            if(Character.isDigit(temp))x.push(temp-'0');
            else if(temp=='+'){
                int v2=x.pop();
                int v1=x.pop();
                x.push(v1+v2);
            }
            else if(temp=='-'){
                int v2=x.pop();
                int v1=x.pop();
                x.push(v1-v2);
            }
            else if(temp=='*'){
                int v2=x.pop();
                int v1=x.pop();
                x.push(v1*v2);
            }
            else if(temp=='/'){
                int v2=x.pop();
                int v1=x.pop();
                x.push(v1/v2);
            }
            else{
                int v2=x.pop();
                int v1=x.pop();
                x.push((int)Math.pow(v1,v2));
            }
            System.out.println(x);
        }
        return x.peek();
    }
}
