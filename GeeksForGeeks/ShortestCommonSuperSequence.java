package GeeksForGeeks;
import java.util.*;

public class ShortestCommonSuperSequence {
    public static void main(String[] args) {
        String a="efgh";
        String b="jghi";
        int ans=solution(a,b);
        System.out.println(ans);
    }

    private static int  solution(String a, String b) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<a.length();i++){
            char item=a.charAt(i);
            if(map.containsKey(item)){
                map.put(item, map.get(item)+1);
            }else{
                map.put(item,1);
            }
        }
        for(int i=0;i<b.length();i++){
            char item=b.charAt(i);
            if(map.containsKey(item)){
                map.put(item, map.get(item)+1);
            }else{
                map.put(item,1);
            }
        }
        int len=0;
        for(char item:map.keySet()){
            len+=map.get(item);
        }
        return len;

    }
}
