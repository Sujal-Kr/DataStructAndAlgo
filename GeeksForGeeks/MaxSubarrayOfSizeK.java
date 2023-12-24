package GeeksForGeeks;

public class MaxSubarrayOfSizeK {
    public static void main(String[] args) {
        int k=4;
        int arr[]={100, 200, 300, 400};
        int ans=solution(arr,k);
        System.out.println(ans);
    }

    private static int solution(int[] arr, int k) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        
        int j=0;
        for(int i=k;i<arr.length;i++){
            max=Math.max(max,sum);
            sum+=arr[i]-arr[j];
            j++;
        }
        max=Math.max(max,sum);
        return max;
    }
}
