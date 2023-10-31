/**
 * The MergeSort class implements the merge sort algorithm to sort an array of integers in ascending
 * order.
 */
package Vit.Dsa;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 6, 8, 0};
        mergesort(arr, 0, arr.length - 1);
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    private static void mergesort(int arr[], int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergesort(arr, l, mid);
            mergesort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    private static void merge(int arr[], int l, int mid, int r) {
        // This portion of code is responsible for merging two sorted subarrays into a single sorted
        // array.
        int n1 = mid - l + 1;
        int n2 = r - mid;
        
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }
        
        int i = 0;
        int j = 0;
        int k = l;
        
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
