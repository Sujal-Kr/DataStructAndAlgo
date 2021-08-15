package HackerRank;
import java.util.*;
public class ArraysManipilation {
    public static void main(String[] args) {
        List<List<Integer>> queries=new ArrayList<>();
        List<Integer> x=new ArrayList<>();
        List<Integer> y=new ArrayList<>();
        List<Integer> z=new ArrayList<>();
        int size=10;
        x.add(1);
        x.add(5);
        x.add(3);
        y.add(4);
        y.add(8);
        y.add(7);
        z.add(6);
        z.add(9);
        z.add(1);
        queries.add(x);
        queries.add(y);
        queries.add(z);
        System.out.println(queries.size());
        System.out.println(manipulation(queries,size));
    }
    static long manipulation(List<List<Integer>> queries,int size) {
        List<Long> result = new ArrayList<>();
        for(int i =0; i <size; i++){
            result.add((long)0);
        }
        for(int i = 0; i <queries.size();i++){

            for(int j = queries.get(i).get(0)-1; j <=queries.get(i).get(1)-1;j++){
                result.set(j,result.get(j)+queries.get(i).get(2));
            }
        }
        long max =Integer.MIN_VALUE;
        for(long item:result){
            if(max<item){
                max = item;
            }
        }
        return max;
    }
}
