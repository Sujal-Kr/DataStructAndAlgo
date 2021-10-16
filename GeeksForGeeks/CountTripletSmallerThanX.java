package GeeksForGeeks;
import java.util.Arrays;
public  class CountTripletSmallerThanX{
    public static void main(String[] args) {
        long arr[]={5, 1, 3, 4, 7};
        // 1,3,4,5,7
        System.out.println(solution(arr,12));
    }

    private static int solution(long[] x, int sum) {
        int count = 0;
        Arrays.sort(x);
        
        for(int i=0;i<x.length-2;i++) {
            int j=i+1;
            int k=x.length-1;
            while(j<k){
                if(x[i]+x[j]+x[k]>=sum)k--;
                else{
                    count+=k-j;
                    j++;
                }
            }
        }
        return count;
    }
    
}
