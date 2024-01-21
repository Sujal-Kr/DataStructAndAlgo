package Vit.CompetativeProgramming;

public class Conversion {
    public static void main(String[] args) {
        int d1=99;
        int c1=99;

        int d2=99;
        int c2=99;
        solution(d1,c1,d2,c2);
    }

    private static void solution(int d1, int c1, int d2, int c2) {
        int total=d1*100+c1+d2*100+c2;
        System.out.println("dollar:"+total/100);
        System.out.println("Cents:"+total%100);
        System.out.println("Sumesh ka bday h 💦💦💦💦💦");

    }
}
