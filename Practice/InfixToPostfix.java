package Practice;
import java.util.*;
public class InfixToPostfix {
    public static void main(String[] args) {
        String exp="a+b*(c^d-e)^(f+g*h)-i"; //abcd^e-fgh*+^*+i-
        String str=solution(exp);
        System.out.println(str);
    }

    private static String solution(String exp) {
        Stack<Character> opr = new Stack<Character>();
        Stack<String> oprnd=new Stack<>();
        for(int i=0; i<exp.length(); i++) {
            char temp = exp.charAt(i);
            if(temp=='('){
                opr.add(temp);
            }
            else if(Character.isLetter(temp)){
                oprnd.push(Character.toString(temp));
            }
            else if(temp==')'){
                while(opr.peek()!='('){
                    char op=opr.pop();
                    String v2 = oprnd.pop();
                    String v1= oprnd.pop();
                    oprnd.push(v1+v2+op);
                }
                opr.pop();
            }
            else{
                while(!opr.isEmpty()&&opr.peek()!='('&&precedence(temp)<=precedence(opr.peek())){
                    char op = opr.pop();
                    String v2=oprnd.pop();
                    String v1=oprnd.pop();
                    oprnd.push(v1+v2+op);
                }
                opr.push(temp);
            }
        }
        while(!opr.isEmpty()){
            char op = opr.pop();
            String v2=oprnd.pop();
            String v1=oprnd.pop();
            oprnd.push(v1+v2+op);
        }
        return oprnd.peek();
    }
    public static int precedence(char temp) {
        if(temp=='+'||temp=='-')return 1;
        if(temp=='*'||temp=='/')return 2;
        else return 3;
    }
}
