package GeeksForGeeks;
import java.util.*;
public class CocDistribution {
    public static void main(String[] args) {
        int arr[]={11,13, 7, 5, 13, 12};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int item:arr){
            list.add(item);
        }
        long ans =solution(list,4);
        System.out.println(ans);
    }

    private static long solution(ArrayList<Integer> list,int m) {
        Collections.sort(list);
        long min=Long.MAX_VALUE;
        System.out.println(list);
        for(int i=0; i<=list.size()-m; i++){
            min=Math.min(min,list.get(i+m-1)-list.get(i));
        }
        return min;
    }
}
