package Vit.CompetativeProgramming;

public class MaximumEqulibriumSum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,4,3,2,1};//{-7,1,5,2,-4,3,0};
        System.out.println(solution(arr));
        System.out.println(optimized_solution(arr));
    }

    private static int solution(int[] arr) {
        int left_sum []=new int[arr.length];
        int right_sum []=new int[arr.length];

        left_sum[0] =arr[0];

        for(int i=1; i<arr.length; i++){
            left_sum[i] = left_sum[i-1]+arr[i];
        }
        right_sum[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            right_sum[i] = right_sum[i+1]+arr[i];
        }
        
        for(int item:left_sum){
            System.out.print(item+" ");
        }
        System.out.println();
        for(int item:right_sum){
            System.out.print(item+" ");
        }
        System.out.println();
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(left_sum[i]==right_sum[i]){
                max=Math.max(max, left_sum[i]-arr[i]);
            }
        }
        return max;
    }
    public static int optimized_solution(int  arr[]){
        int total=0;
        int leftSum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            total-=arr[i];
            if(leftSum==total&&leftSum>max){
                max=leftSum;
            }
            leftSum+=arr[i];
        }
        return max;
    }
}
