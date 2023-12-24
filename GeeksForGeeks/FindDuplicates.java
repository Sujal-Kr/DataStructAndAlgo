package GeeksForGeeks;
import java.util.*;
public class FindDuplicates {
    public static void main(String[] args) {
        int arr[]={2,3,1,2,3};
        System.out.println(solution(arr));
    }

    private static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count[]=new int[arr.length];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        for(int i=0; i<count.length; i++){
            if(count[i]>1)list.add(i);
        }
        if(list.isEmpty())list.add(-1);
        return list;
    }
}
