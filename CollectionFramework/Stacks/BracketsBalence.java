package CollectionFramework.Stacks;
import java.util.Scanner;
import java.util.Stack;
public class BracketsBalence {
    public static void main(String[] args) {
        Stack<Character> x=new Stack<>();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String containg Brackets");
        String s=in.nextLine();
        boolean check=false;
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(c=='{'||c=='['||c=='('){
                x.push(c);
                continue;
            }
            if(c==')'){
                if(x.peek()=='('){
                    x.pop();
                }
            }
            if(c=='}'){
                if(x.peek()=='{'){
                    x.pop();
                }
            }
            if(c==']'){
                if(x.peek()=='['){
                    x.pop();
                }
            }
            if(x.empty()){
                check=true;
                break;
            }
        }
        if(check==true){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
        in.close();        
    }
}
