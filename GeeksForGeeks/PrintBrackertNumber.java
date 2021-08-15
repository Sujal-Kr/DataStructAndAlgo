package GeeksForGeeks;
import java.util.ArrayList;
import java.util.Stack;
public class PrintBrackertNumber {
    public static void main(String[] args) {
        String exp="(aa(bdc))p(dee)â€‹";
        System.out.println(bracketcount(exp));
    }

    private static ArrayList<Integer> bracketcount(String exp) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<Integer> x = new Stack<Integer>();
        int count = 0;
        for(int i=0;i<exp.length();i++) {
            char temp=exp.charAt(i);
            if(temp=='('){
                x.push(++count);
                result.add(count);
            }
            else if(temp==')'){
                result.add(x.peek());
                x.pop();
            }
        }
        return result;
    }
}
