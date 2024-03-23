package GeeksForGeeks;

public class SwapTheArrayElements {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        solution(arr);
        for(int item:arr){
            System.out.println(item);
        }
    }

    private static void solution(int[] arr) {
        for(int i=0;i<arr.length-2;i++){
            int temp=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
        return;
    }
}
