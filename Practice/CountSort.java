package Practice;
public class CountSort{
    public static void main(String[] args) {
        int arr[]={8,7,6,5,4,3,2,1,0};
        solution(arr);
        for (int item : arr) {
            System.out.print(item+" ");
        }
        System.out.println();
    }

    private static void solution(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int item:arr){
            max=Math.max(max,item);
        }
        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++) {
            count[arr[i]]++;
        }
        for(int i=1;i<count.length;i++) {
            count[i]+=count[i-1];
        }
        int output[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--) {
            output[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
        for (int i = 0; i < output.length; i++) {
            arr[i]=output[i];
        }
    }
}