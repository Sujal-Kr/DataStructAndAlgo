package LeetCode;
import java.util.*;
public interface IsomorphicString {
    public static void main(String[] args) {
        String one="paper";
        String two="title";
        System.out.println(isomorphic(one, two));
    }

    public static boolean isomorphic(String one, String two) {
        if(one.length()!= two.length())return false;
        Map<Character, Character> map = new HashMap<>();
        for(int i=0; i<one.length(); i++){
            char si= one.charAt(i);
            char ti= two.charAt(i);
            if(map.containsKey(si)){
                if(map.get(si)!=ti)return false;
            }
            else{
                if(map.containsValue(ti))return false;
                map.put(si,ti);
            }
        }
        return true;
    }

}
