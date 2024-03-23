package CodingNinjas;
import java.util.*;
public class practice {
    public static void main(String[] args) {
        String str="irdfdkfsdf";
        String ans =solution(str);
        System.out.println(ans);
    }

    private static String solution(String str) {
        String temp="";
        for(int i=str.length()-1; i>=0; i--){
            temp+=str.charAt(i);
        }
        return temp;
    }
}
