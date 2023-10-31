package GeeksForGeeks;
import java.util.*;
public class TwiceCounter {
    public static void main(String[] args) {
        String str[]= {"Geeks", "For", "Geeks"};
        System.out.println(solution(str));
    }

    private static int solution(String[] str) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        for(String item:str){
            if(map.containsKey(item)){
                map.put(item,map.get(item)+1);
            }else{
                map.put(item,1);
            }
        }
        int ans=0;
        for(String item:map.keySet()){
            if(map.get(item)==2)ans++;
        }
        return ans;
    }
}
