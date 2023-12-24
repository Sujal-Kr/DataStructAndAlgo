package Practice;

public class TrappingRainWater {
    public static void main(String[] args) {
        int arr[]={7,4,0,9};
        System.out.println(solution(arr));
    }
    private static long solution(int[] arr){
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        left[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            left[i]=Math.max(arr[i],left[i-1]);
        }
        right[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            right[i]=Math.max(arr[i],right[i+1]);
        }
        long ans=0;
        for(int i=0;i<arr.length;i++){
            int temp=Math.min(left[i],right[i]);
            ans+=temp-arr[i];
        }
        return ans;
    }
}
