package HackerRank;
import java.util.Stack;
public class BalancedBrackets {
    public static void main(String[] args) {
        String x="{{{{}}}{}}";
        System.out.println(checkbalance(x));
    }

    private static String checkbalance(String x) {
        Stack<Character> c=new Stack<Character>();
        for(int i=0;i<x.length();i++){
            char temp=x.charAt(i);
            if(temp=='('||temp=='{'||temp=='['){
                c.push(temp);
                continue;
            }
            else if(temp==')'){
                if(!c.isEmpty()&&c.peek()=='(')c.pop();
                else return "NO";
            }
            else if(temp=='}'){
                if(!c.isEmpty()&&c.peek()=='{')c.pop();
                else return "NO";
            }
            else{
                if(!c.isEmpty()&&c.peek()=='[')c.pop();
                else return "NO";
            }
            
        }
        return c.isEmpty()?"YES":"NO";
    }
}
