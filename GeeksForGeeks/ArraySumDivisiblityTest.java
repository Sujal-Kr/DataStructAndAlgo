package GeeksForGeeks;
import java.util.*;
public class ArraySumDivisiblityTest {
    public static void main(String[] args) {
        int arr[]={6 ,14 ,12 ,14};
        System.out.println(solution(arr,2));
        
    }

    private static boolean solution(int[] arr,int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int item:arr){
            if(map.containsKey(item%k)){
                map.put(item%k,map.get(item%k)+1);
            }else map.put(item%k,1);
        }

        for(int item:map.keySet()){
            int rem=Math.abs(k-item);
            if(item==0&&map.get(item)%2!=0)return false;
            if(item!=0&&map.get(rem)!=map.get(item))return false;
        }
        return true;
    }
}
