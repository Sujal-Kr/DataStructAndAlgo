package Vit.CompetativeProgramming;

public class Cricket {
    public static void main(String[] args) {
        
        int balls=300;
        int runs=375;
        int scored=78;
        int ballsDone=45;
        solution(balls,runs,scored,ballsDone);

    }

    private static void solution(int balls, int runs, int scored, int ballsDone) {
        int overs=balls/6;
        System.out.println(overs);
        double finished=(ballsDone/6) + 0.1*(ballsDone%6);
        System.out.println(finished);
        double curr_rate=(double)scored/finished;
        double total_rate=(double)runs/overs;
        System.out.printf("%.1f\n",curr_rate);
        System.out.printf("%.1f\n",total_rate);
        if(curr_rate >total_rate) System.out.println("Elegible to Win");
        else System.out.println("Not Elegible to Win"); 
    }
}
