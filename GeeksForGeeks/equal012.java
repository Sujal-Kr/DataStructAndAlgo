package GeeksForGeeks;
import java.util.*;
public class equal012 {
    public static void main(String[] args) {
        String str="0102010";
        System.out.println(solution(str));
    }
    public static long solution(String str) {
        long ans=0;
        int count0=0;
        int count1=0;
        int count2=0;
        String key=(count1-count0)+"#"+(count2-count1);
        Map<String, Integer> map=new HashMap<String, Integer>();
        map.put(key,1);
        for(int i=0; i<str.length();i++){
            char temp=str.charAt(i);
            if(temp=='0')count0++;
            else if(temp=='1')count1++;
            else if(temp=='2')count2++;
            key=(count1-count0)+"#"+(count2-count1);
            if(map.containsKey(key)){
                ans+=map.get(key);
                map.put(key,map.get(key)+1);

            }
            else map.put(key,1);
        }
        return ans;
    }
}

