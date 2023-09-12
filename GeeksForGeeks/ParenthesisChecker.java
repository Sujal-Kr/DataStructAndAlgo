package GeeksForGeeks;
import java.util.Stack;

public class ParenthesisChecker{
    public static void main(String[] args) {
        String str="{([])}";
        boolean ispar = solution(str);
        System.out.println(ispar);
    }

    private static boolean solution(String str) {
            Stack<Character> stack=new Stack<>();
            for(int i=0; i<str.length(); i++) {
                char c = str.charAt(i);
                if(c=='('||c=='{'||c=='[') {
                    stack.push(c);
                    continue;
                }
                if(c==')'){
                    if(!stack.isEmpty()&&stack.peek()=='(') {
                        stack.pop();
                    }else{
                        return false;
                    }
                }
                if(c=='}'){
                    if(!stack.isEmpty()&&stack.peek()=='{') {
                        stack.pop();
                    }else{
                        return false;
                    }
                }
                if(c==']'){
                    if(!stack.isEmpty()&&stack.peek()=='[') {
                        stack.pop();
                    }else{
                        return false;
                    }
                }
                
                
            }
            return stack.isEmpty()?true:false;
        }
}