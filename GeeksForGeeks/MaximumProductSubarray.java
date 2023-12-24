package GeeksForGeeks;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int arr[]={2, 3, 4, 5, -1, 0};
        System.out.println(solution(arr));   
    }
    private static long solution (int[] arr){
        long max=Long.MIN_VALUE;
        long prod=1;
        for(int i=0;i<arr.length;i++){ 
            prod*=arr[i];
            max=Math.max(max,prod);
            if(prod==0)prod=1;
        }
        prod=1;
        for(int i=arr.length-1;i>=0;i--){
            prod*=arr[i];
            max=Math.max(max,prod);
            if(prod==0)prod=1;
        }
        return max;
    }
}
