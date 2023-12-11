package GeeksForGeeks;
import java.util.*;
public class AnagramOfString {
    public static void main(String[] args) {
        String str="basgadhbfgvhads";
        String x="sjdhgvbjdsbhvbvd";
        int ans=solution(str, x);
        System.out.println(ans);
    }

    private static int solution(String str, String x) {
        int arr[]=new int[256];
        Arrays.fill(arr,0);
        for (int i = 0; i < str.length(); i++) {
            char temp=str.charAt(i);
            
            arr[temp-'0']++;
        }
        for(int i=0;i<x.length();i++){
            char temp=x.charAt(i);
            
            arr[temp-'0']--;
        }

        int count=0;
        for (int i = 0; i < arr.length; i++) {
            count+=Math.abs(arr[i]);
        }
        
        return count;
    }
}
