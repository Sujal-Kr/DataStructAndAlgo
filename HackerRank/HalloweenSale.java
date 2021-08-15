package HackerRank;

public class HalloweenSale {
    public static void main(String[] args) {
        int p=20;
        int d=3;
        int m=6;
        int s=85;
        int games=games_count(p,d,m,s);
        System.out.println("no of games: " + games);
    }

    private static int games_count(int p, int d, int m, int s) {
        int count=0;
        int sum=0;
        while(sum<s){
            if(sum+p<=s){
                sum+=p;
                count++;
            }
            else break;
            if(p-d>=m)p-=d;
            else p=m;
        }
        return count;
    }
}
