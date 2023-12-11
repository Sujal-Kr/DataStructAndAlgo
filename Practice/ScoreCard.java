package Practice;
import java.util.Scanner;

class Player{
    String name;
    int score;
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}
public class ScoreCard {
    public static void main(String[] args) {
        Player arr[] = new Player[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the player and their score:- ");
        for(int i=0; i<arr.length; i++){
            String name = sc.next();
            int score = sc.nextInt();
            arr[i]=new Player(name, score);
        }
        // System.out.println("players scorecard:- ");
        
        System.out.println("NAME \t SCORE" );
        System.out.println("----\t-----");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i].name +"\t "+ arr[i].score);
            System.out.println();
        }
        sc.close();
    }
}
