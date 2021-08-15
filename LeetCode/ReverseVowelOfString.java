package LeetCode;
import java.util.List;
import java.util.ArrayList;
public class ReverseVowelOfString {
    public static void main(String[] args) {
        String x="leetcode";
        System.out.println(reverse(x));
    }

    private static String reverse(String x) {
        List<Character> list = new ArrayList<>();
        for(int i=0; i<x.length(); i++) {
            char item=x.charAt(i);
            if(item=='a'||item=='e'||item=='i'||item=='o'||item=='u'||item=='A'||item=='E'||item=='I'||item=='O'||item=='U')list.add(item);
        }
        int p=0;
        char[] string=x.toCharArray();
        for(int i=x.length()-1; i>=0; i--){
            char item=string[i];
            if(item=='a'||item=='e'||item=='i'||item=='o'||item=='u'||item=='A'||item=='E'||item=='I'||item=='O'||item=='U')
            string[i]=list.get(p++);
        }
        String ans="";
        for(char item:string){
            ans+=item;
        }
        return ans;
    }
}
