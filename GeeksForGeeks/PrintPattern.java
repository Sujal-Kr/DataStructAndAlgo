package GeeksForGeeks;
import java.util.*;
public class PrintPattern {
    public static void main(String[] args) {
        int n=0;
        for(int item:pattern(n)){
            System.out.println(item);
        }
    }
    static boolean reached;
    private static List<Integer> pattern(int n) {
        List<Integer> list = new ArrayList<Integer>();
        reached = false;
        helper(n, list);
        return list;
    }

    private static void helper(int n, List<Integer> list) {
        if(n == 0&&!reached){
            list.add(n);
            return;
        }
        if(n>0&&!reached){
            if(n-5<=0)reached=true;
            list.add(n);
            helper(n-5, list);

            return;
        }else{
            if(list.get(0)==n){
                list.add(n);
                return;
            }
            list.add(n);
            helper(n+5, list);
        }

        
    }
}
