package GeeksForGeeks;

import java.util.*;

public class SubsetOrNot {
    public static void main(String[] args) {
        
        int a1[] = {11, 1, 13, 21, 3, 7};
        int a2[] = {11, 3, 7, 1};
        String x=solution(a1, a2);
        System.out.println(x);
    }

    private static String solution(int[] a1, int[] a2) {
        Set<Integer> x=new HashSet<Integer>();
        for(int item :a1) x.add(item);
        for(int item :a2) if(!x.contains(item))return "NO";
        return "YES";
    }
}
