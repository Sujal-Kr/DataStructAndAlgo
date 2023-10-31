package Vit.Dsa;
public class RadixSort{
    public static void main(String[] args) {
        int arr[]={1,16,23,516,21};
        solution(arr);
        for(int item:arr){
            System.out.print(item+" ");
        }
        System.out.println();
    }

    private static void solution(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int item:arr){
            max=Math.max(max,item);
        }
        int digits=findDigit(max);
        int place=1;
        // The `while(digits-->0)` loop in the `solution` method is used to perform the Radix Sort
        // algorithm.
        while(digits-->0){
            System.out.println(place);
            countSort(arr,place);
            place*=10;
        }
    }

    private static void countSort(int[] arr, int place) {
        // The code is finding the maximum value in the given array `arr`. It initializes `max` with
        // the minimum possible value for an integer (`Integer.MIN_VALUE`) and then iterates over each
        // element in the array. For each element, it compares the current maximum value with the
        // element and updates `max` if the element is greater. At the end of the loop, `max` will
        // contain the maximum value in the array.
        int max=Integer.MIN_VALUE;
        for(int item:arr){
            max=Math.max(max,item);
        }
        int count[] =new int[max+1];
        
        for(int i=0;i<arr.length;i++){
            count[(arr[i]/place)%10]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        int output[]=new int[arr.length];
        
        for(int i=arr.length-1;i>=0;i--){
            output[count[(arr[i]/place)%10]-1]=arr[i];
            count[(arr[i]/place)%10]--;

        }
        for (int i = 0; i < output.length; i++) {
            arr[i]=output[i];
        }   
    }

    private static int findDigit(int max) {
        int temp=max;
        int count=0;
        while(temp>0){
            count++;
            temp/=10;
        }
        return count;
    }


    
}
