package PepCoding.Stacks;
import java.util.Stack;
public class EnfixEvalution {
    public static void main(String[] args) {
        String exp="2+(5-3*6/2)";
        System.out.println(evaluate(exp));
    }

    private static int evaluate(String exp) {
        Stack<Character> oprt=new Stack<>();
        Stack<Integer> oprnd=new Stack<>();       
        for(int i=0;i<exp.length();i++){
            char temp=exp.charAt(i);
            if(Character.isDigit(temp))oprnd.push(temp-'0');
            else if(temp=='('){
                oprt.push(temp);
            }
            else if(temp==')'){
                while(oprt.peek()!='('){
                    char opr= oprt.pop();
                    int v2=oprnd.pop();
                    int v1=oprnd.pop();
                    int ans=operation(v1,v2,opr);
                    oprnd.push(ans);
                }
                oprt.pop();
            }
            else if(temp=='+'||temp=='-'||temp=='*'||temp=='/'){
                while(!oprt.isEmpty()&&oprt.peek()!='('&&precedence(temp)<=precedence(oprt.peek())){
                    char opr= oprt.pop();
                    int v2=oprnd.pop();
                    int v1=oprnd.pop();
                    int ans=operation(v1,v2,opr);
                    oprnd.push(ans);
                }
                oprt.push(temp);
            }
        }
        while(!oprt.isEmpty()){
            char opr= oprt.pop();
            int v2=oprnd.pop();
            int v1=oprnd.pop();
            int ans=operation(v1,v2,opr);
            oprnd.push(ans);
        }

        return oprnd.peek();
    }
    private static int precedence(char opr){
        if(opr=='+')return 1;
        else if(opr=='-')return 1;
        else if(opr=='*')return 2;
        else return 2;
    }
    private static int operation(int v1,int v2 ,char opr) {
        if(opr=='+')return v1+v2;
        else if(opr=='-') return v1-v2;
        else if(opr=='*') return v1*v2;
        else return v1/v2;
    }
}
