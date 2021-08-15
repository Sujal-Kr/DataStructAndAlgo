package HackerRank;
import java.util.*;
public class BearAndSteadyGenes {
    public static void main(String[] args) {
        String s="GAAATAAA";
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }
            map.put(temp,1);
        }
        return 0;
    }
}
