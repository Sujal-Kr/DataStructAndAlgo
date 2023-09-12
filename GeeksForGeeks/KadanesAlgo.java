package GeeksForGeeks;
public class KadanesAlgo{
    public static void main(String[] args) {
        int arr[] = {1,2,3,-2,5};
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        int max_sum=Integer.MIN_VALUE;
        int curr_sum=0;
        for(int i=0; i<arr.length; i++) {
            curr_sum=Math.max(curr_sum+arr[i],arr[i]);
            max_sum=Math.max(max_sum,curr_sum);
        }
        return max_sum;
    }
}