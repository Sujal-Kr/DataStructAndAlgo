package HackerRank;
import java.util.*;
public class ClimbingLeaderboard{
    public static void main(String[] args) {
        List<Integer> score=new ArrayList<Integer>();
        List<Integer> alice=new ArrayList<Integer>();
        
        // Leaderboard marks...
        score.add(100);
        score.add(100);
        score.add(91);
        score.add(92);
        score.add(90);
        score.add(90);
        score.add(80);
        score.add(80);
        score.add(60);
        score.add(50);
        score.add(45);
        score.add(44);
        score.add(43);
        
        //System.out.println(Rank);
        // alice's Marks
        alice.add(16);
        alice.add(45);
        alice.add(60);
        alice.add(80);
        alice.add(91);
        alice.add(100);
        //System.out.println(score);
        
        //System.out.println(score);
        Set<Integer> Rank=new LinkedHashSet<Integer>(score);
        score.clear();
        score.addAll(Rank);
        
        int marks[]=new int[Rank.size()];
        List<Integer> result=new ArrayList<Integer>();
        int rank=0;
        marks[0]=1;
        int size=score.size()-1;
        for(int i=0;i<Rank.size();i++){
            marks[i]=++rank;
        }
        // for(int i=0;i<marks.length;i++){
        //     System.out.print(marks[i]+" ");
        // }
        // System.out.println();
        for(int i=0;i<alice.size();i++){
            
            if(alice.get(i)<score.get(score.size()-1)){
                result.add(marks[(marks.length-1)]+1);
            }
            else{
                result.add(marks[linear(score,alice.get(i),size--)]);
            }
        }
        System.out.println(result);
    }
     static  int linear(List<Integer> x,int k,int size){
        int index=0;
        for(int i=size;i>=0;i--){
            if(k>=x.get(i)){
                index=i;
            }
        }
        return index;
    }
}