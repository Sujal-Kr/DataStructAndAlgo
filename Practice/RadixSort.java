package Practice;

public class RadixSort {
    public static void main(String[] args) {
        int arr[]={323,456,678,121,81};
        solution(arr);
        for(int item:arr){
            System.out.print(item+" ");
        }
    }

    private static void solution(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int item:arr){
            max=Math.max(max,item);
        }
        int digits=countDigits(max);
        int place=1;
        while(digits-->0){
            countSort(arr,place);
            place*=10;
        }
    }

    private static void countSort(int[] arr, int place) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(max,(arr[i]/place)%10);
        }
        int count[]=new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            count[(arr[i]/place)%10]++;
        }
        for(int i=1;i<count.length;i++) {
            count[i]+=count[i-1];
        }
        int output[]=new int [arr.length];
        for(int i=arr.length-1; i>=0; i--) {
            output[count[(arr[i]/place)%10]-1]=arr[i];
            count[(arr[i]/place)%10]--;
        }
        for (int i = 0; i < output.length; i++) {
            arr[i]=output[i];
        }

    }

    private static int countDigits(int num) {
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
}
