package GeeksForGeeks;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int arr[]={1,5,6};
        int ans=solution(arr);
        System.out.println(ans);
    }

    private static int solution(int[] arr) {
        int sum=0;
        for(int item:arr)sum+=item;
        int local_sum=0;
        for(int i=0;i<arr.length;i++){
            local_sum+=arr[i];
            if(2*(local_sum-arr[i])==sum-arr[i])return i+1;
        }
        return -1;
    }
}
