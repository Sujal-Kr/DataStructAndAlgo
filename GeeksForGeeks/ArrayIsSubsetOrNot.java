package GeeksForGeeks;
import java.util.*;
public class ArrayIsSubsetOrNot {
    int n[]={11, 7, 1, 13, 21, 3, 7, 3};
    int m[] = {11, 3, 7, 1, 7};
    int ans =solution(n,m);
    private int solution(int[] n, int[] m) {
        Map<Integer,Integer> map =new HashMap<>();
        for(int i = 0; i < n.length; i++) {
            if(map.containsKey(n[i])){
                map.put(n[i],map.get(n[i])+1);
            }else{
                map.put(n[i],1);
            }
        }
        for(int item:m){
            if(!map.containsKey(item))return 0;
        }
    
        return 1;
    }
}
