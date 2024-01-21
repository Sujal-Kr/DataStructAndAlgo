package GeeksForGeeks;
import java.util.*;
public class FindMissingInSecondArray {
    public static void main(String[] args) {
        long a[] = {1, 2, 3, 4, 5, 10};
        long b[] = {2, 3, 1, 0, 5};
        for(Long item:solution(a,b)){
            System.out.print(item+" ");
        }
    }
    public static ArrayList<Long> solution(long a[],long b[]){
        ArrayList<Long> list = new ArrayList<>();
        Map<Long,Integer> map = new HashMap<>();
        for(long item:b){
            map.put(item,1);
        }
        for(long item:a){
            if(!map.containsKey(item)){
                list.add(item);
            }
        }
        return list;
    }
}
