package GeeksForGeeks;

public class MaximuxIndex {
    public static void main(String[] args) {
        int arr[]={34, 8, 10, 3, 2, 80, 30, 33, 1};
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        int ans=-1;
        int min[]=new int[arr.length];
        int max[]=new int[arr.length];
        int temp_max=arr[arr.length-1];
        int temp_min=arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i]<temp_min)temp_min=arr[i];
            min[i]=temp_min;
        }
        for(int i=arr.length-1; i>=0;i--){
            if(arr[i]>temp_max)temp_max=arr[i];
            max[i]=temp_max;
        }   
        int j=arr.length-1;
        for(int i=arr.length-1; i>=0; i--){
            while(min[i]>max[j])j--;
            ans=Math.max(ans,j-i);
        }
        return ans;
    }
}
