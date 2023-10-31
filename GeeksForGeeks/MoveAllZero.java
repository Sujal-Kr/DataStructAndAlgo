package GeeksForGeeks;

public class MoveAllZero {
    public static void main(String[] args) {
        int arr[]={3, 5, 0, 0, 4};
        int a[]={0,0,0,3,1,4};
        solution(arr);
        for(int item:arr) {
            System.out.println(item);
        }
    }
    private static void solution(int[] arr) {
        
        int p=0;
        for(int i=0 ;i<arr.length;i++){
            if (arr[i]!=0) {
                int temp=arr[i];
                arr[p]=arr[i];
                arr[p]=temp;
                p++;
            }
        }
        for(int i=p ;i<arr.length;i++){
            arr[i]=0;
        }
    }
}
