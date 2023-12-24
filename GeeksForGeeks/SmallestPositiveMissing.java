package GeeksForGeeks;
import java.util.*;
public class SmallestPositiveMissing {
    public static void main(String[] args) {
        int arr[]={0,-10,1,3,-20};
        System.out.println(solution(arr));
        System.out.println(opt_solution(arr));
    }

    private static int solution(int[] arr) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int max=-1;
        for(int item:arr){
            map.put(item,1);
            max=Math.max(max,item);
        }
        for (int i=1; i<=max; i++) {
            if(!map.containsKey(i))return i;
        }

        return max<0?1:max+1;
    }
    private static int opt_solution(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                
            }
        }
        return 0;
    }
}
