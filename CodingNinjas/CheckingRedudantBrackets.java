package CodingNinjas;
import java.util.*;
public class CheckingRedudantBrackets {
    public static void main(String[] args) {
        String str="((b+c))";
        System.out.println(solution(str));
    }

    private static boolean solution(String str) {
        Stack<Character> stack=new Stack<>();
        for(int i=0; i<str.length();i++){
            char temp=str.charAt(i);
            if(temp=='('){
                stack.push(temp);

            }
            else if(!stack.isEmpty()&&temp=='+'&&stack.peek()=='('){
                stack.push(temp);
            }
            else if(temp==')'){
                boolean valid=false;
                while(stack.peek()!='('){
                    if(stack.peek()=='+')valid=true;    
                    stack.pop();
                }
                stack.pop();
                if(!valid)return true;
            }
        }
        return false;
    }
}
