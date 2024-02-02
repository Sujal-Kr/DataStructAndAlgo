package Vit.CompetativeProgramming;
import java.util.*;
public class StrobogrammaticNumber {
    public static void main(String[] args) {
        String n="96069";
        System.out.println(solution(n));
    }

    private static boolean solution(String n) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put('6','9');
        map.put('9','6');
        map.put('0','0');
        map.put('1','1');
        map.put('8','8');
        int l=0;
        int r=n.length()-1;
        while(l<=r){
            
            if(!map.containsKey(n.charAt(l)))return false;
            else{
                if(map.get(n.charAt(l))!=n.charAt(r))return false;
            }
            l++;
            r--;
        }
       return true;
    }
}
