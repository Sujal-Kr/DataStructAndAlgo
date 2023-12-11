package Practice;

public class CompareSort {
    static int cmp_count=0;
    public static void main(String[] args) {
        int arr[]={9, -4, 5, 8,-3, 7, 0, 4, 1, 2};
        bubbleSort(arr.clone());
        System.out.println(cmp_count+" for bubble sort");
        cmp_count=0;
        heapsort(arr.clone());
        System.out.println(cmp_count+" for heap sort");
        
    }
    private static void bubbleSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    cmp_count++;
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
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
