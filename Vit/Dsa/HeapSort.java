package Vit.Dsa;

public class HeapSort {
    static int cmp_count=0;
    public static void main(String[] args) {
        int arr[]={3,6,1,8,9,12};
        heapsort(arr);
        for(int item:arr){
            System.out.print(item+" ");
        }
    }

    private static void heapsort(int[] arr) {
        int n=arr.length;
        for(int i=n/2-1; i>=0; i--){
            heapify(arr,n,i);
        }

        for(int i=arr.length-1; i>0; i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int max=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<n && arr[left]> arr[max]){
            cmp_count++;
            max=left;
        }
        if(right<n && arr[right]> arr[max]){
            cmp_count++;
            max=right;
        }
        if(max!=i){
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
            heapify(arr, n, max);
        }
    }
}
