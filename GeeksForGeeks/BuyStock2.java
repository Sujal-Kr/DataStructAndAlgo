package GeeksForGeeks;

public class BuyStock2 {
    public static void main(String[] args) {
        long arr[]={1,2,3,4,5,6,7};
        long ans =solution(arr);
        System.out.println(ans);
    }
    private static long solution(long[] arr){
        
        long ans=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                ans+=arr[i]-arr[i-1];
            }
        }
        return ans;
    }
}
