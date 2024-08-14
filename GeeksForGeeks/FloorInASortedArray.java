package GeeksForGeeks;

public class FloorInASortedArray {
    public static void main(String[] args) {
        int arr[]={1,2,8,10,11,12,19};
        System.out.println(solution(13,arr));
    }
    public static int solution(int k, int arr[]) {
        int i=0;
        int j=arr.length -1;
        int ans=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]<=k){
                ans=mid;
                i=mid+1;
            }else j=mid-1;
        }

        return ans;
    }
}
