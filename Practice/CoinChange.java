package Practice;

public class CoinChange {
    public static void main(String[] args) {
        int arr[]={3,2,1};
        System.out.println(solution(arr));
    }
    public static int solution(int arr[]){
        int min=Integer.MAX_VALUE;
        int index=0;
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min=arr[i];
                index=i;
            }
        }

        return min*arr.length+index;
    }
}
