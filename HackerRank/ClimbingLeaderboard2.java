package HackerRank;
import java.util.*;
public class ClimbingLeaderboard2 {
    public static void main(String[] args) {
        List<Integer> Leaderboard=new ArrayList<Integer>();
        List<Integer> alice=new ArrayList<Integer>();
        Map<Integer, Integer> ranking=new HashMap <Integer, Integer>();
        int rank=1;
        List<Integer> ans=new ArrayList<Integer>();
        
        // Leaderboard marks...
        Leaderboard.add(100);
        Leaderboard.add(91);
        Leaderboard.add(92);
        Leaderboard.add(90);
        Leaderboard.add(90);
        Leaderboard.add(80);
        Leaderboard.add(80);
        Leaderboard.add(60);
        Leaderboard.add(50);
        Leaderboard.add(45);
        // alice's Marks
        alice.add(16);
        alice.add(18);  
        alice.add(45);
        alice.add(60);
        alice.add(80);
        alice.add(91);
        alice.add(100);
        for(int i=0; i<Leaderboard.size(); i++){
            if(!ranking.containsKey(Leaderboard.get(i))){
                ranking.put(Leaderboard.get(i),rank++);
            }
        }
        System.out.println(ranking);
        int initial=Leaderboard.size()-1;
        for(int score:alice){
            
            for(int i=initial; i>=0; i--){
                if(score>=Leaderboard.get(i)){
                    rank=ranking.get(Leaderboard.get(i));
                    initial=i-1;
                }
                else{
                    break;
                }
            }
            ans.add(rank);
            
        }
        System.out.println(ans);
        
    }
}
