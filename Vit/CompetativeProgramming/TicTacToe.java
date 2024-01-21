package Vit.CompetativeProgramming;

public class TicTacToe {
    public static void main(String[] args) {
        solution(6);
    }

    private static void solution(int n) {
        int count=1;
        for(int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                if(count++==n){
                    System.out.println(i +" "+ j);
                    break;
                }
            }
        }
        System.out.println("simple solution");
        System.out.println((n-1)/3);
        System.out.println((n-1)%3);
    }
}
