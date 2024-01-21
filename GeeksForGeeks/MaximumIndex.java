package GeeksForGeeks;

public class MaximumIndex {
    public static void main(String[] args) {
        int arr[]={34, 8, 10, 3, 2, 80, 30, 33, 1};
        int ans=solution(arr);
        System.out.println(ans);
    }

    private static int solution(int[] arr) {
        int right_max[]=new int[arr.length];
        int left_min[]=new int[arr.length];
        int min=arr[0];
        int max=arr[arr.length-1];
        for(int i=0; i<arr.length; i++){
            min=Math.min(min,arr[i]);
            left_min[i]=min;
        }
        for(int i=arr.length-1; i>=0; i--){
            max=Math.max(max,arr[i]);
            right_max[i]=max;
        }
        int ans=0;
        int i=0;
        int j=0;
        while(i<arr.length&&j<arr.length){
            if(left_min[i]<=right_max[j]){
                ans=Math.max(ans,j-i);
                j++;
            }
            else i++;
        }
        return ans;
    }
}
