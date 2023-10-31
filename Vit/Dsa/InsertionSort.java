package Vit.Dsa;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={9,5,1,4,3};
        solution(arr);
    }

    private static void solution(int[] arr) {
        for(int i=1; i<arr.length; i++){
            int key=arr[i]; 
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int item:arr){
            System.out.print(item+" ");
        }
        System.out.println();
    }
    
}
