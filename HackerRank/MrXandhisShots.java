//Intervals
package HackerRank;
import java.util.*;
public class MrXandhisShots {
    public static void main(String[] args) {
        List<Integer> range1=new ArrayList<>();
        List<Integer> range2=new ArrayList<>();
        List<Integer> range3=new ArrayList<>();
        List<Integer> range4=new ArrayList<>();
        List<Integer> player1=new ArrayList<>();
        List<Integer> player2=new ArrayList<>();
        List<Integer> player3=new ArrayList<>();
        List<Integer> player4=new ArrayList<>();
        List<List<Integer>> x=new ArrayList<>();
        List<List<Integer>> player=new ArrayList<>();
        range1.add(1);
        range1.add(2);
        range2.add(2);
        range2.add(3);
        range3.add(4);
        range3.add(5);
        range4.add(6);
        range4.add(7);
        player1.add(1);
        player1.add(5);
        player2.add(2);
        player2.add(3);
        player3.add(4);
        player3.add(7);
        player4.add(5);
        player4.add(7);
        x.add(range1);
        x.add(range2);
        x.add(range3);
        x.add(range4);
        player.add(player1);
        player.add(player2);
        player.add(player3);
        player.add(player4);
        System.out.println(x);
        System.out.println(player);
        int ans =intervals(x,player);
        System.out.println(ans);
    }
    static int intervals(List<List<Integer>> shots, List<List<Integer>> player){
        int strength=0;
        for(int i = 0; i < player.size(); i++){
            int c=player.get(i).get(0);
            int d=player.get(i).get(1);
            for(int j = 0; j<shots.size(); j++){
                int a=shots.get(j).get(0);
                int b=shots.get(j).get(1);
                if((c>=a&&c<=b)||(d>=a&&d<=b)){
                    strength++;
                }
            }
        }
        return strength;
    }
} 
