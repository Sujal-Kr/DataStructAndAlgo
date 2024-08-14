package HackerRank;

public class EqualizingArrayElements {
    public static void main(String[] args) {
        int arr[]={64,30,25,33};
        System.out.println(solution(arr,2,2));
    }

    private static int solution(int[] arr, int t, int d) {
        for(int i=0;i<arr.length;i++){
            System.out.println((int)(Math.log(arr[i])/Math.log(d)));
        }
        return 0;
    }
    
}
