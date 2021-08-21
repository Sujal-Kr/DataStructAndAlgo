package PepCoding.Recursion;
import java.util.ArrayList;
import java.util.List;
public class StringSubsequence{
    public static void main(String[] args) {
        String s="abc";
        System.out.println(subseq(s));
    }

    public static List<String> subseq(String s) {
        if(s.length()==0){
            List<String> l = new ArrayList<String>();
            l.add("");
            return l;
        }
        char ch=s.charAt(0);
        String rest=s.substring(1);
        List<String> z=subseq(rest);
        List<String> ans = new ArrayList<String>();
        for(String item:z){
            ans.add(item);
        }
        for(String item:z){
            ans.add(ch+item);
        }
        return ans;
    }
}