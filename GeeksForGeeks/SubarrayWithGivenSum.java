package GeeksForGeeks;
import java.util.*;
public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37, 192, 5, 103, 154, 93, 183, 22, 117, 119, 96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134};        
        int k=468;
        System.out.println(solution(arr,k));
    }
    private  static ArrayList<Integer> solution(int[] arr,int k) {
        ArrayList<Integer> res=new ArrayList<>();
        int sum=0;
        int i=0;
        int j=0;
        while(j<arr.length) {
            sum+=arr[j];
            if(sum>k){
                while(i<j&&sum>k){
                    sum-=arr[i];
                    i++;
                }
            }
            if(sum==k){
                break;
            }
            j++;
            
        }
        if(j==arr.length){
            res.add(-1);
        }
        else{
            res.add(i+1);
            res.add(j+1);
        }
        
        return res;
    }
}
