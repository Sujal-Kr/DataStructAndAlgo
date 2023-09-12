package GeeksForGeeks;
public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int arr[]={2, 2, 2, 2};
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        int count = 1;
        if(arr.length==0) return 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1]) count++;
        }

        return count;
    }
}
