package Vit.PlacementTraining;
import java.util.*;
public class BlanacingBrackets {
    public static void main(String[] args) {
        String str="{{[()}}";
        System.out.println(solution(str));
    }
    public static boolean solution(String str) {
        Stack<Character> x=new Stack<Character>();

        for(int i=0; i<str.length(); i++){
            char temp=str.charAt(i);
            if(temp=='('||temp=='{'||temp=='['){
                x.push(temp);
                continue;
            }else if(temp=='}'){
                if(!x.isEmpty()&&x.peek()=='{')x.pop();
                else return false;
            }else if(temp==']'){
                if(!x.isEmpty()&&x.peek()=='[')x.pop();
                else return false;
            }else{
                if(!x.isEmpty()&&x.peek()=='(')x.pop();
                else return false;
            }
        }

        return x.isEmpty()?true:false;
    }
}
