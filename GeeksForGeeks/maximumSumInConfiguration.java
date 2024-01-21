package GeeksForGeeks;

public class maximumSumInConfiguration {
    public static void main(String[] args) {
        int arr[]={8,3,1,2};
        System.out.println(solution(arr));
    }
    public static int solution(int arr[]){
        int sum=0;
        int indexSum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            indexSum+=arr[i]*i;
        }
        int max=indexSum;
        int rotatedSum=indexSum;
        for(int i=0; i<arr.length; i++){
            rotatedSum+=sum-arr.length*arr[arr.length-i-1];
            max=Math.max(rotatedSum, max);
        }
        return max;
    }
}
