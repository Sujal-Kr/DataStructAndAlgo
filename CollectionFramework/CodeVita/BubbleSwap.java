package CollectionFramework.CodeVita;

import java.util.Scanner;

public class BubbleSwap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int asc = soltuion(arr.clone(), true);
        int desc = soltuion(arr.clone(), false);
        int ans=Math.min(asc, desc);
        System.out.println(ans);
        
    }

    
    private static int soltuion(int[] arr, boolean mode) {
        
        int count = 0;
        for (int i=0; i<arr.length-1;i++) {
            for (int j=0; j<arr.length-i-1; j++) {

                if(mode) {
                    if(arr[j]>arr[j+1]) {
                        count++;
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
                else{
                    if(arr[j] < arr[j + 1]) {
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
