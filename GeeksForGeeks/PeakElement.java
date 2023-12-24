package GeeksForGeeks;

public class PeakElement {
    public static void main(String[] args) {
        int arr[]={1,13};
        int ans=solution(arr);
        System.out.println(ans);
    }
    // private static int solution(int[] arr){
    //     int n=arr.length;
    //     if(arr[0]>arr[1])return 0;
    //     for(int i=1;i<n-1;i++){
    //         if(arr[i-1]<arr[i]&&arr[i]>arr[i+1])return i;
    //     }
    //     return arr[n-2]<arr[n-1]?n-1:-1;
        
    // }
    private static int solution(int[] arr){
        int start=1;
        int end=arr.length-2;
        if(arr[0]>arr[1])return start;
        while(start<=end){
            int peek=start+(end-start)/2;
            if(arr[peek]>arr[peek-1]&&arr[peek]>arr[peek+1])return peek;
            else if(arr[peek]<arr[peek+1])start=peek+1;
            else end=peek-1;
        }
        if(arr[arr.length-1]>arr[arr.length-2])return arr.length-1;
        return -1;
    }
}
