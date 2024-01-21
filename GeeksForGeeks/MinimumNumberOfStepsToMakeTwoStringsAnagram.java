package GeeksForGeeks;
import java.util.*;
public class MinimumNumberOfStepsToMakeTwoStringsAnagram {
    public static void main(String[] args) {
        String str= "bab";
        String t = "aba";
        int ans=solution2(str, t);
        System.out.println(ans);
    }

    public static int solution(String str, String t) {
        Map<Character,Integer> freq1=new HashMap<Character,Integer>();
        Map<Character,Integer> freq2=new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++){
            char item=str.charAt(i);
            if(freq1.containsKey(item)){
                freq1.put(item,freq1.get(item)+1);
            }else freq1.put(item,1);
        }
        for(int i=0;i<t.length();i++){
            char item=t.charAt(i);
            if(freq2.containsKey(item)){
                freq2.put(item,freq2.get(item)+1);
            }else freq2.put(item,1);
        }
        int ans=0;
        for(char item:freq2.keySet()){
            if(freq1.containsKey(item)){
                ans+=Math.abs(freq1.get(item)-freq2.get(item));
            }
        }
        return ans;
    }
    public static int solution2(String s1, String s2){
        
        return 0;
    }
}
