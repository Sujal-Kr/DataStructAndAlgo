package Vit.Dsa;
import java.util.Stack;
public class InfixToPostfix {
    public static void main(String[] args) {
        String str ="a+b*(c^d-e)^(f+g*h)-i";
        String postfix=solution(str);
        System.out.println(postfix);
    }

    private static String solution(String str) {
        Stack<String> oprnd =new Stack<>();
        Stack<Character> opr=new Stack<>();
        for(int i=0;i<str.length();i++) {
            char temp = str.charAt(i);
            if(Character.isLetter(temp)){
                oprnd.push(Character.toString(temp));
            }
            else if( temp=='('){
                opr.push(temp);
            }
            else if(temp==')'){
                while(opr.peek()!='('){
                    String v2=oprnd.pop();
                    String v1=oprnd.pop();
                    char oprt=opr.pop();
                    oprnd.push(v1+v2+oprt);
                }
                opr.pop();
            }
            else{
                while(!opr.isEmpty()&&opr.peek()!='('&&precedence(opr.peek())>=precedence(temp)){
                    char oprt=opr.pop();
                    String v2=oprnd.pop();
                    String v1=oprnd.pop();
                    oprnd.push(v1+v2+oprt);
                }
                opr.push(temp);
            }
        }
        System.out.println(oprnd.peek());
        while(!opr.isEmpty()){
            String v2=oprnd.pop();
            String v1=oprnd.pop();
            char oprt=opr.pop();
            oprnd.push(v1+v2+oprt);
        }
        return oprnd.peek();
    }
  

    public static int precedence(char c){
        if(c=='+'||c=='-')return 1;
        else if(c=='/'||c=='*') return 2;
        else return 3;
    }
}
