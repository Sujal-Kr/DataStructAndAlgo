package Tcs;
import java.util.*;

public class MaximumTipCalculator {

    static class Pair {
        int x;
        int y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 7, 6, 6, 6, 1, 3, 4, 8, 10};
        int brr[] = {10, 7, 7, 9, 1, 3, 2, 9, 3, 4};
        System.out.println(solution(8, 2, arr, brr));
    }

    private static int solution(int x, int y, int[] arr, int[] brr) {
        int ans = 0;
        List<Pair> diff = new LinkedList<>();
        
        for (int i = 0; i < arr.length; i++) {
            diff.add(new Pair(arr[i], brr[i]));
        }

        
        Collections.sort(diff, (a, b) ->  Math.abs(b.x - b.y) - Math.abs(a.x - a.y));
        
        for (int i = 0; i < diff.size(); i++) {
            if (x > 0 && (diff.get(i).x > diff.get(i).y || y == 0)) {
                ans += diff.get(i).x;
                x--;
            } else {
                ans += diff.get(i).y;
                y--;
            }
        }

        return ans;
    }
}
