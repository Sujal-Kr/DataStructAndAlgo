package GeeksForGeeks;
import java.util.Stack;
public class InfixToPrefix {
    public static void main(String[] args) {
        String exp="a+b*(c^d-e)^(f+g*h)-i"; //-+a*b^-^cde+f*ghi
        System.out.println(prefixconvert(exp));
    }
    private static String prefixconvert(String exp) {
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
                    oprnd.push(opr+v1+v2);
                }
                oprt.pop();
            }
            else if(temp=='+'||temp=='-'||temp=='*'||temp=='/'||temp=='^'){
                while(!oprt.isEmpty()&&oprt.peek()!='('&&precedence(temp)<=precedence(oprt.peek())){
                    char opr=oprt.pop();
                    String v2=oprnd.pop();
                    String v1=oprnd.pop();
                    oprnd.push(opr+v1+v2);
                }
                oprt.push(temp);
            }
        }
        while(!oprt.isEmpty()){
            char opr=oprt.pop();
            String v2=oprnd.pop();
            String v1=oprnd.pop();
            oprnd.push(opr+v1+v2);
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
