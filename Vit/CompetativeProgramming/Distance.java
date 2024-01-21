package Vit.CompetativeProgramming;

public class Distance {
    public static void main(String[] args) {
        int x1=2;
        int y1=4;
        int x2=10;
        int y2=15;
        solution(x1, y1, x2,y2);
    }

    private static void solution(int x1, int y1, int x2, int y2) {
        double midx=(double)(x1+x2)/2;
        double midy=(double)(y1+y2)/2;
        System.out.printf("%.1f", midx);
        System.out.println();
        System.out.printf("%.1f", midy);

    }
}
