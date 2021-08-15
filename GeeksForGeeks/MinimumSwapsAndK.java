package GeeksForGeeks;
import java.util.ArrayDeque;
public class MinimumSwapsAndK {
    public static void main(String[] args) {
        int[] x={2, 7, 9, 5, 8, 7, 4};
        int k=6;
        int swaps=swaps_count(x,k);
        System.out.println("minimum swaps required: " +swaps);
    }

    private static int swaps_count(int[] x,int k) {
        ArrayDeque<Integer> win=new ArrayDeque<Integer>();
        int count=0;
        for(int item:x){
            if(item<=k)count++;
        }
        int big_count=0;
        int min=0;
        for(int i=0;i<x.length;i++){
            if(i<count)win.add(x[i]);

            min=Math.min(min,big_count);
            big_count=0;
        }
        return min;
    }
}
