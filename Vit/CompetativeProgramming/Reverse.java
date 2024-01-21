package Vit.CompetativeProgramming;

public class Reverse {
    public static void main(String[] args) {
        int num=452;
        

        solution(num);
    }

    private static void solution(int num) {
        
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans=ans*10+rem;
            num/=10;
        }
        System.out.println(ans);
    }
}
