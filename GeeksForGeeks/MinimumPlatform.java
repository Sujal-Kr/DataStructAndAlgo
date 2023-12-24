package GeeksForGeeks;
import java.util.*;


public class MinimumPlatform {
    static class pair{
        int arr;
        int dep;
        pair(int arr,int dep){
            this.arr=arr;
            this.dep=dep;
        }
    }
    public static void main(String[] args) {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(solution(arr, dep));
    }

    private static int solution(int[] arr, int[] dep) {
        int i=0;
        int j=0;
        int max=0;
        int count=0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        while(i<arr.length){
            if(arr[i]<dep[j]){
                count++;
                max=Math.max(max,count);
                i++;
            }else{
                count--;
                j++;
            }
        }
        return max;
    }
}
