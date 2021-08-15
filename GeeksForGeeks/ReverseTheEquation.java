package GeeksForGeeks;
import java.util.Stack;
public class ReverseTheEquation {
    public static void main(String[] args) {
        String eq="201-3+5*2";
        String ans=reverse(eq);
        System.out.println(ans);
    }

    private static String reverse(String eq) {
        Stack<String> st=new Stack<String>();
        char[] ch=eq.toCharArray();
        String temp="";
        for(int i=0; i<ch.length; i++) {
            if(Character.isDigit(ch[i])){
                temp+=ch[i];
            }
            else{
                st.push(temp);
                temp="";
                st.push(Character.toString(ch[i]));
            }
        }
        st.push(temp);
        String ans="";
        while(!st.isEmpty())ans+=st.pop();
        return ans;
    }
}
