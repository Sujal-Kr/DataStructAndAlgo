package GeeksForGeeks;
import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        String number="10";
        System.out.println("Largest no that can be formed is " +largest(number));
    }

    private static String largest(String n) {
        char[] x=n.toCharArray();
        Arrays.sort(x);
        String result="";
        for(int i=x.length-1; i>=0; i--){
            result+=x[i];
        }
        return result;
    }
}
