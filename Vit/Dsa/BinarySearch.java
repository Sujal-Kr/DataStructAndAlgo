package Vit.Dsa;
public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={3,6,10,34,56};
        int key=122;
        System.out.println(solution(arr,key));
    }

    private static boolean solution(int[] arr, int key) {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key)return true;
            else if(arr[mid]<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}
