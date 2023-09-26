package GeeksForGeeks;

public class NFibonacciNum {
    public static void main(String[] args) {
        for(long item:solution(5)){
            System.out.print(item+" ");
        }
    }

    private static long[] solution(int n) {
        long[] arr = new long[n];
        long first=1;
        arr[0]=first;
        long second=1;
        if(arr.length>1)arr[1]=second;
        for(int i=2;i<n;i++) {
            long third=first+second;
            arr[i]=third;
            first=second;
            second=third;
        }
        return arr;
    }
}
