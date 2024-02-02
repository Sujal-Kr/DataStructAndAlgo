package GeeksForGeeks;
import java.util.*;
public class PanagramChecking{
    public static void main(String[] args) {
        String str="Bawds jog, flick quartz, veX nymph";
        System.out.println(solution(str));
    }

    private static boolean solution(String str) {
        Set<Character> set=new HashSet<>();
        if(str.length()<26)return false;
        for(char item : str.toCharArray()){
            if(Character.isLetter(item)){
                set.add(Character.toLowerCase(item));
            }
        }
        return set.size()==26;
    }
}