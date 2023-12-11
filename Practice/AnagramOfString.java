package Practice;
import java.util.*;
public class AnagramOfString {
    public static void main(String[] args) {
        String str="cddgk";
        String x="gcd";
        solution(str, x);
    }

    private static int solution(String str, String x) {
        int arr[]=new int[256];
        System.out.println();
        Arrays.fill(arr,0);
        for (int i = 0; i < arr.length; i++) {
            char temp=str.charAt(i);
            System.out.println(temp-'0');
            arr[temp-'0']++;
        }

        for(int i=0;i<x.length();i++){
            char temp=x.charAt(i);
            arr[temp-'0']--;
        }

        int count=0;
        for(int item:arr){
            if(item!=0)count++;
        }
        
        return count;
    }
}
