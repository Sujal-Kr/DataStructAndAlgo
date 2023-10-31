package Vit.Dsa;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={3,5,2,8,7};
        sort(arr);
        System.out.println("happy hoding");
    }

    public static void sort(int[] arr) {
        // The code snippet you provided is implementing the Selection Sort algorithm.
        for(int i=0; i<arr.length-1; i++){
            // The code snippet `int min=i; for(int j=i+1; j<arr.length; j++){ if(arr[j]<arr[min]){
            // min=j; } }` is finding the index of the minimum element in the unsorted portion of the
            // array.
            int min=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            // The code snippet `int temp=arr[i]; arr[i]=arr[min]; arr[min]=temp;` is swapping the
            // values of `arr[i]` and `arr[min]`.
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        // The code `for(int item :arr)System.out.print(item +" ");` is using an enhanced for loop to
        // iterate over each element in the array `arr` and print it to the console. The code
        // `System.out.println();` is used to print a new line after printing all the elements of the
        // array.
        for(int item :arr)System.out.print(item +" ");
        System.out.println();
    }
}
