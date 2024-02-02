package GeeksForGeeks;

public class CountPairsInArray {
    public static void main(String[] args) {
        int arr[]={8, 4, 2, 1};
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        int count = 0;
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++){
                if(i*arr[i]>j*arr[j])count++;
            }
        }
        return count;
    }
}
