package GeeksForGeeks;
import java.util.Arrays;
public class FourElementSum {
    public static void main(String[] args) {
        int x[] = {1,2,3,4,5};
        int k=10;
        System.out.println(solution(x, k));
    }

    private static boolean solution(int[] x, int k) {
        Arrays.sort(x);
        for(int i=0; i<x.length-3; i++) {
            for(int j=i+1; j<x.length-2; j++) {
                int start = j+1;
                int end = x.length-1;
                while(start<end){
                    if(x[i]+x[j]+x[start]+x[end]==k)return true;
                    else if(x[i]+x[j]+x[start]+x[end]<k)start++;
                    else end--;
                }
            }
        }
        return false;
    }
}
