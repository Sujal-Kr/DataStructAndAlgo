package Vit.Dsa;

public class CountSort {
    public static void main(String[] args) {
        int arr[]={1,2,4,3,1,5,8};
        countSort(arr);
    }

    private static void countSort(int[] arr) {
        int max=Integer.MIN_VALUE;
        
        for(int item:arr){
            max=Math.max(max,item);
        }
        int count[]=new int[max+1];
        int output[]=new int[arr.length];  
        for(int item:arr){
            count[item]++;
        }
       

        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        
        for(int i=arr.length-1;i>=0;i--){
            output[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
        for(int item:output){
            System.out.print(item+" ");
        }
        System.out.println();
    }

}
