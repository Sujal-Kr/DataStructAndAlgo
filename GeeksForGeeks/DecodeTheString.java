package GeeksForGeeks;
import java.util.Stack;
public class DecodeTheString {
    public static void main(String[] args) {
        String str="1[b]";
        // String s="bcacabcacabcaca";
        String ans=decode(str);
        System.out.println(ans);
        // System.out.println(s.equals(ans));
    }

    private static String decode(String str) {
        Stack<String> ch=new Stack<>();
        for(int i=str.length()-1; i>=0; i--) {
            char temp = str.charAt(i);
            if(Character.isLetter(temp)){
                if(ch.isEmpty())ch.push(Character.toString(temp));
                else {
                    String item=ch.pop();
                    ch.push(temp+item);
                }
            }
            if(Character.isDigit(temp)){
                String z=ch.pop();
                String ans="";
                for(int j=0;j<temp-'0';j++)ans+=z;
                ch.push(ans);
            }
        }
        return ch.peek();
    }

}
