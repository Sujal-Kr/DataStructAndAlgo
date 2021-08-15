package HackerRank;
import java.util.*;
public class SequenceEquation {
    public static void main(String[] args) {
        List<Integer> n = new ArrayList<>();
        n.add(5);
        n.add(2);
        n.add(1);
        n.add(3);
        n.add(4);
        System.out.println(permutationequation(n));
    }
    static List<Integer> permutationequation(List<Integer> x){
        List<Integer> ans=new ArrayList<Integer>();
        
        for(int i=0; i<x.size(); i++){
            int index=x.indexOf(x.indexOf(i+1)+1)+1;
            ans.add(index);
        }
        return ans;
    }
    
}
