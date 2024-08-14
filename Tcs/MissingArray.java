package Tcs;

public class MissingArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        System.out.println(solution(arr.length+1,arr));
    }
    public static int solution(int n,int arr[]){
        int sum=(n*(n+1))/2;
        int curr=0;
        for(int item:arr){
            curr+=item;
        }
        System.out.println(sum);
        return sum-curr;
    }
}
