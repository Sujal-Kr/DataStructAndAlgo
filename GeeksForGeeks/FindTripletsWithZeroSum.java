package GeeksForGeeks;
import java.util.Arrays;
public class FindTripletsWithZeroSum {
    public static void main(String[] args) {
        int arr[]= {0, -1, 2, -3, 1};
        System.out.println(solution(arr));
    }

    private static boolean solution(int[] arr) {
        Arrays.sort(arr); 
        System.out.println();
        for(int i=0;i<arr.length-2;i++){
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                if(arr[i]+arr[j]+arr[k]==0){
                    System.out.println(i + " "+ j+ " "+k);
                    return true;
                }
                else if(arr[i]+arr[j]+arr[k]>0)k--;
                else j++;
            } 
        }   
        return false;
    }
}
