package GeeksForGeeks;

public class MissingNumberInArray {
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(solution(arr));
    }
    public static int solution(int[] arr) {
        int n=arr.length+1;
        int req_sum=(n*(n+1))/2;
        int curr_sum=0;
        for(int item:arr){
            curr_sum+=item;
        }
        return req_sum-curr_sum;
    }
}
