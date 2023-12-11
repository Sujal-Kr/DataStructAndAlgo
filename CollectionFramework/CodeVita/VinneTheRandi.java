package CollectionFramework.CodeVita;

import java.util.*;

public class VinneTheRandi {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input total amount and total types of materials
        int N = in.nextInt();
        int M = in.nextInt();

        // Input quantity_available array
        int[] qtyAvl = new int[M];
        for (int i = 0; i < M; i++) {
            qtyAvl[i] = in.nextInt();
        }

        // Input quantity_needed array
        int[] qtyNed = new int[M];
        for (int i = 0; i < M; i++) {
            qtyNed[i] = in.nextInt();
        }

        // Input cost_of_one_unit array
        int[] cost = new int[M];
        for (int i = 0; i < M; i++) {
            cost[i] = in.nextInt();
        }

        // Input selling_price array
        int[] sp = new int[M];
        for (int i = 0; i < M; i++) {
            sp[i] = in.nextInt();
        }
        int ans=solution(N,M,qtyAvl,qtyNed,cost,sp);
        System.out.println(ans);
        in.close();
    }

    private static int solution(int n, int m, int[] qtyAvl, int[] qtyNed, int[] cost, int[] sp) {
        int profit=0;
        int bal=n;
        for(int i = 0; i < m; i++) {
            int total_toy_cost=cost[i]*qtyNed[i];
        }
        return 0;
    }

}
