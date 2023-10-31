package GeeksForGeeks;
import java.util.*;
public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int arr[]={10, 5, 2, 7, 1, 9};
        int arr2[]={1,4,3,3,5,5};
        int ans=solution(arr2,16);
        System.out.println(ans);
        ans=opt_solution(arr2, 16);
        System.out.println("optmized approach "+ans);
        System.out.println(findLongest(arr2,16));
    }

    private static int findLongest(int[] arr, int k) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        map.put(0,-1);
        int max=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            // if(sum==k)max=Math.max(max,i+1);
            if(map.containsKey(sum-k)){
                max=Math.max(max,Math.abs(i-map.get(sum-k)));
            }
            map.putIfAbsent(sum,i);
        }
        return max;
    }

    private static int opt_solution(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            sum+=arr[i];
            // if sum is equal to k from the zeroth element, then..
            if(sum==k){
                max=i+1;
            }
            // if sum is again encountered,in between...
            else if(map.containsKey(sum-k)){
                max=Math.max(max,i-map.get(sum-k));
            }else{
                map.put(sum,i);
            }
        }

        return max;
    }

    private static int solution(int[] arr, int k) {
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length-1; i++){
            int sum=arr[i];
            for(int j=i+1; j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    max=Math.max(max, j-i+1);
                }
            }
        }
        return max;
    }

}
