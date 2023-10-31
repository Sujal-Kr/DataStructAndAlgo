package GeeksForGeeks;
import java.util.*;
public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        int arr[]={1, 1, 2, 5, 5,5};
        boolean unique=solution(arr);
        System.out.println(unique);
    }

    public static boolean solution(int[] arr) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int item:arr){
            if(map.containsKey(item)){
                map.put(item, map.get(item)+1);
            }
            else{
                map.put(item,1);
            }
        }
        System.out.println(map);
        Set<Integer> set=new HashSet<Integer>();
        for(int item:map.values()){

            if(set.contains(item))return false;
            set.add(item);
        }
        return true;
    }
}
