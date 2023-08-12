package GeeksForGeeks;
import java.util.ArrayList;
public class LeadersInAnArray {
    public static void main(String[] args) {
        int arr[]={6,5,4,3,2,1};
        System.out.println(solution(arr));
    }

    public static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int max[]=new int[arr.length];
        int c_max=arr.length-1;
        
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=arr[c_max]){
                c_max=i;
            }
            max[i]=c_max;
        }
        
        for(int i=0;i<max.length-1;i++){
            if(max[i]!=max[i+1]){
                list.add(arr[max[i]]);
            }
        }
        list.add(arr[arr.length-1]);
        return list;
    }
}
