package GeeksForGeeks;
import java.util.*;
public class IsomorphicString {
    public static void main(String[] args) {
        String str1="aab";
        String str2="xxy";
        boolean ans=solution(str1, str2);
        System.out.println(ans);
    }

    private static boolean solution(String str1, String str2) {
        if(str1.length()!=str2.length())return false;
        Map<Character,Character> map1=new HashMap<>();
        Map<Character,Character> map2=new HashMap<>();
        
        for(int i=0; i<str1.length(); i++){
            char temp1=str1.charAt(i);
            char temp2=str2.charAt(i);
            if(map1.containsKey(temp1)){
                if(map1.get(temp1)!=temp2)return false;
            }else{
                map1.put(temp1, temp2);
            }
            if(map2.containsKey(temp2)){
                if(map2.get(temp2)!=temp1)return false;
            }else{
                map2.put(temp2, temp1);
            }
        }
        System.out.println(map1);
        System.out.println(map2);
        return true;
    }
}
