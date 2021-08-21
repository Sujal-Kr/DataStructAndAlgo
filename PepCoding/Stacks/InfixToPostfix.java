package PepCoding.Stacks;
import java.util.Stack;
public class InfixToPostfix {
    public static void main(String[] args) {
        String exp="a+b*(c^d-e)^(f+g*h)-i"; //abcd^e-fgh*+^*+i-
        System.out.println(postfixconvert(exp));
    }
    private static String postfixconvert(String exp) {
        Stack<Character> oprt=new Stack<>();
        Stack<String> oprnd=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char temp=exp.charAt(i);
            if(temp=='(')oprt.push(temp);
            else if(Character.isLetter(temp))oprnd.push(Character.toString(temp));
            else if(temp==')'){
                while(oprt.peek()!='('){
                    char opr=oprt.pop();
                    String v2=oprnd.pop();
                    String v1=oprnd.pop();
                    oprnd.push(v1+v2+opr);
                }
                oprt.pop();
            }
            else if(temp=='+'||temp=='-'||temp=='*'||temp=='/'||temp=='^'){
                while(!oprt.isEmpty()&&oprt.peek()!='('&&precedence(temp)<=precedence(oprt.peek())){
                    char opr=oprt.pop();
                    String v2=oprnd.pop();
                    String v1=oprnd.pop();
                    oprnd.push(v1+v2+opr);
                }
                oprt.push(temp);
            }
        }
        while(!oprt.isEmpty()){
            char opr=oprt.pop();
            String v2=oprnd.pop();
            String v1=oprnd.pop();
            oprnd.push(v1+v2+opr);
        }
        return oprnd.peek();
    }
    private static int precedence(char opr){
        if(opr =='+')return 1;
        else if(opr =='-')return 1;
        else if(opr =='*')return 2;
        else if(opr =='/') return 2;
        else return 3;
    }
    
}

