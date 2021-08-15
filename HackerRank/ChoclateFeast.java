package HackerRank;

public class ChoclateFeast {
    public static void main(String[] args) {
        int n=6;
        int c=2;
        int m=2;
        int x=choclatecount(n,c,m);
        System.out.println("No of choclate= "+x);
    }

    private static int choclatecount(int n, int c, int m) {
        int count;
        count=n/c;
        int wrap=count;
        int r;
        while(wrap>=m){
            int curr=wrap/m;
            count+=curr;
            r=wrap%m;
            wrap=curr+r;
        }
        return count;
    }
}
