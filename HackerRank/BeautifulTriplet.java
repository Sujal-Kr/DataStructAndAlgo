package HackerRank;
import java.util.*;
public class BeautifulTriplet {
    public static void main(String[] args) {
        int[] x={1, 2, 4, 5, 7, 8, 10};
        List<Integer> list=new ArrayList<>();
        for(int item:x){
            list.add(item);
        }
        int d=3;
        int pair=solution(list,d);
        System.out.println("No of pairs found="+pair);
    }
    private static int solution(List<Integer> x,int d) {
        int count=0;
        for(int i=0;i<x.size();i++){
            for(int j=i+1;j<x.size();j++){
                if(x.get(j)-x.get(i)==d){
                    for(int k=j+1;k<x.size();k++){
                        if(x.get(k)-x.get(j)==d)count++;
                    }
                }
            }
        }
        return count;
    }
}
