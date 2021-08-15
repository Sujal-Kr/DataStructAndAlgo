package GeeksForGeeks;
import java.util.Stack;
public class GeekAndNumberString {
    public static void main(String[] args) {
        String s="12213";
        System.out.println(reduce(s));
    }

    private static int reduce(String s) {
        Stack<Character> st = new Stack<>();
        if(s.length()<=3)return 0;
        for(int i=0; i<s.length(); i++)st.push(s.charAt(i));  
        while(st.size()>3){
            
        }
        return 0;
    }
}