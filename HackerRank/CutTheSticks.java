package HackerRank;
import java.util.*;
public class CutTheSticks {
    public static void main(String[] args) {
        List<Integer> sticks=new ArrayList<Integer>();
        sticks.add(5);
        sticks.add(4);
        sticks.add(4);
        sticks.add(2);
        sticks.add(2);
        sticks.add(8);
        System.out.println(solution(sticks));
    }
    static List<Integer> solution(List<Integer> x){
        List<Integer> size=new ArrayList<>();
        while(!x.isEmpty()){
            int temp=min(x);
            List<Integer> T=new ArrayList<>();
            T.add(0);
            for(int i=0;i<x.size(); i++){
                x.set(i,x.get(i)-temp);
            }
            size.add(x.size());
            x.removeAll(T);
            T.clear();
        }
        return size;   
    }
    static int min(List<Integer> x){
        int min =Integer.MAX_VALUE;
        for(int i=0;i<x.size();i++){
            if(min>x.get(i))
            min=x.get(i);
        }

        return min;
    }
    
}
