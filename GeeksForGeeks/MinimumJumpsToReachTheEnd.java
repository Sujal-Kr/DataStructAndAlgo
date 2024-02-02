package GeeksForGeeks;

public class MinimumJumpsToReachTheEnd {
    public static void main(String[] args) {
        int arr[]={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        int farthest=0;
        int curr=0;
        int jumps=0;
        for(int i=0; i<arr.length-1; i++) {
            farthest=Math.max(farthest,arr[i]+i);
            if(i==curr){
                jumps++;
                curr=farthest;
            }
        }
        return jumps;
    }
}
