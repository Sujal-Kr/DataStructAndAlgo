package GeeksForGeeks;
import java.util.*;
public class TransformString {
    public static void main(String[] args) {
        String a="GeeksForGeeks";
        String b="ForGeeksGeeks";
        int ans=solution(a,b);
        System.out.println(ans);
    }

    private static int solution(String a, String b) {
        if(a.length()!=b.length())return -1;
        Map<Character,Integer> a_frq = new HashMap<>();
        Map<Character,Integer> b_frq = new HashMap<>();
    
        for (int i = 0; i < a.length(); i++) {
            char item = a.charAt(i);
            if(a_frq.containsKey(item)){
                a_frq.put(item,a_frq.get(item)+1);
            }else{
                a_frq.put(item,1);
            }
        }
        System.out.println(a_frq);
        for (int i = 0; i < b.length(); i++) {
            char item = b.charAt(i);
            if(b_frq.containsKey(item)){
                b_frq.put(item,b_frq.get(item)+1);
            }else{
                b_frq.put(item,1);
            }
        }
        System.out.println(b_frq);

        if(!a_frq.equals(b_frq))return -1;
        
        int i=a.length()-1;
        int j=a.length()-1;
        int ans=0;
        while(i>=0){
            if(a.charAt(i)==b.charAt(j)){
                i--;
                j--;
            }
            else{
                ans++;
                i--;
            }
        }
        return ans;
    }
}
