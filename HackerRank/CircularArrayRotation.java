package HackerRank;
import java.util.*;
public class CircularArrayRotation {
    public static void main(String[] args) {
        List<Integer> x=new ArrayList<Integer>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        List<Integer> Queries=new ArrayList<Integer>();
        Queries.add(1);
        Queries.add(2);
        int k=2;
        List<Integer> ans=new ArrayList<Integer>(solution(x,k,Queries));
        System.out.println(ans);
    }

    private static List<Integer> solution(List<Integer> x, int k, List<Integer> queries) {
        int n=x.size();
        List<Integer> answer = new ArrayList<Integer>();
        for(int i=0;i<k;i++){
            int temp=x.get(n-1);
            int j;
            for(j=n-1;j>0;j--){
                x.set(j,x.get(j-1));
            }
            x.set(j,temp);
        }
        for(int i=0;i<queries.size();i++){
            answer.add(x.get(queries.get(i)));
        }
        return answer;
    }
}
