package GeeksForGeeks;
import java.util.Stack;
public class EvalutionOfPostfix {
    public static void main(String[] args) {
        String exp="23+6*5+89+/";
        String post="623+-382/+*2^3+";
        System.out.println(evalution(exp));
    }
    private static int evalution(String exp) {
        Stack<Integer> x=new Stack<>();
        for(int i=0; i<exp.length(); i++) {
            char temp=exp.charAt(i);
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
            
        }
        return x.peek();
    }
}
