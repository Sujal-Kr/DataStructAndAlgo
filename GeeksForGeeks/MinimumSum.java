package GeeksForGeeks;
import java.util.*;
public class MinimumSum {
    public static void main(String[] args) {
        int arr[]={5, 3, 0, 7, 4};
        System.out.println(solution(arr));
    }

    private static String solution(int[] arr) {
        Arrays.sort(arr);
        int i=0;
        int j=1;
        String one="";
        String two="";
        while(i<arr.length&&j<arr.length){
            one+=arr[i];
            two+=arr[j];
            i+=2;
            j+=2;
        }
        
        while(i<arr.length)one+=arr[i++];
        while(j<arr.length)one+=arr[j++];
        int ans=Integer.parseInt(one)+Integer.parseInt(two);
        return ans+"";
    }
}
