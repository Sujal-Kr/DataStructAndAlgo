package Vit.Dsa;
import java.util.*;
public class ArrayProb {

   public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int arr[] = new int[10];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        System.out.print("Enter the Index  ");
        
        int index=in.nextInt();
        int value = in.nextInt();
        insert( index, value,  arr);
        update(index, value, arr);
        deletion(index,arr);
        output(arr);
        in.close();
   }

    private static void deletion(int index, int[] arr) {
        if(index==arr.length-1){
            arr[index]=0;
            return;
        }

        for(int i=index; i<arr.length-1; i++){
            arr[i]=arr[i+1];
        }
        
    }

    private static void insert(int index,int value, int[] arr) {
        if(index==0){
            arr[index]=value;
            return; 
        }
        for(int i=arr.length-1; i>=index;i--){
            arr[i] = arr[i-1];
        }
        arr[index] = value;
    }
    public static void output(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
    }
    private static void update(int index, int value, int arr[]){
        arr[index] = value;
    }

}
