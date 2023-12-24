package GeeksForGeeks;
import java.util.ArrayList;
public class LeadersInArray {
    public static void main(String[] args) {
        int arr[]={16,17,4,3,5,2};
        for(Integer item:solution(arr)){
            System.out.print(item+" ");
        }
    }

    private static ArrayList<Integer> solution(int[] arr) {
        int max[]=new int[arr.length];
        ArrayList<Integer> list =new ArrayList<>();
        int local_max=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            local_max=Math.max(local_max, arr[i]);
            max[i]=local_max;
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max[i])list.add(arr[i]);
        }
        return list;
    }
}