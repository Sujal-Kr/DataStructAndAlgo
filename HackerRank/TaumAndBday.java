package HackerRank;
public class TaumAndBday{
    public static void main(String[] args) {
        int b=3;
        int w=5;
        int bc=3;
        int wc=5;
        int z=1;
        System.out.println(taumBday(b,w,bc,wc,z));
    }
    public static long taumBday(int b, int w, int bc, int wc, int z) {
        long ans=0;
        ans=b*Math.min((long)bc,(long)wc+z)+w*Math.min((long)wc,(long)bc+z);
        return ans;
    }
}