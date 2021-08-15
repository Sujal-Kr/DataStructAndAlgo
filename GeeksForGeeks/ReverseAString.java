package GeeksForGeeks;
import java.util.Stack;
public class ReverseAString {
    public static void main(String[] args) {
        String s= "i.like.this.program.very.much";
        System.out.println(reverse(s));
    }

    private static String reverse(String s) {
        Stack<Character> st = new Stack<Character>();
        String ans="";
        String temp="";
        for(int i=0; i<s.length(); i++) {
            st.push(s.charAt(i));
        }
        while(!st.isEmpty()){
            if(st.peek()!='.')temp+=st.pop();
            else {
                temp=st.pop()+temp;
                ans=temp+ans;
                temp="";
            }
        }
        ans=temp+ans;
        return ans;
    }    
}
