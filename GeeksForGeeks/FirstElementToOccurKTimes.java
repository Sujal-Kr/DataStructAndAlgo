package GeeksForGeeks;
import java.util.*;
public class FirstElementToOccurKTimes {
    public static void main(String[] args) {
        int arr[]={3, 1, 3, 4, 5, 1, 3, 3, 5, 4};
        System.out.println(solution(arr,3));
    }
    public static int solution(int arr[],int k){
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
            if(map.get(arr[i])==k)return arr[i];
        }
        System.out.println(map);
        return -1;
    }
}
