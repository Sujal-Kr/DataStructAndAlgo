package PepCoding.Stacks;
import java.util.Stack;
public class DuplicateBrackets {
    public static void main(String[] args) {
        String b="((a+b)+(c+d))";
        System.out.println(checkduplicate(b));
    }

    private static boolean checkduplicate(String b) {
        Stack<Character> x=new Stack<Character>();
        for(int i=0; i<b.length();i++){
            char temp = b.charAt(i);
            if(temp==')'){
                if(x.peek()=='(')return true;
                else while(x.peek()!='(')x.pop(); 
                x.pop();
            }
            else x.push(temp);
        }
        return false;
    }

}
