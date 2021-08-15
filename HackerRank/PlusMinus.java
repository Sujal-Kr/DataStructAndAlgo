package HackerRank;
import java.util.*;
public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> x=new ArrayList<>();
        x.add(1);
        x.add(2);
        x.add(-1);
        x.add(-2);
        x.add(0);
        ratio(x);
    }

    private static void ratio(List<Integer> x) {
        double pos=0;
        double neg=0;
        double zero=0;
        for(int item : x) {
            if(item>0)pos++;
            else if(item<0)neg++;
            else zero++;
        }
        double a=pos/x.size();
        double b=neg/x.size();
        double c=zero/x.size();
        System.out.format("%.6f",a);
        System.out.println();
        System.out.format("%.6f",b);
        System.out.println();
        System.out.format("%.6f",c);
    }
}
