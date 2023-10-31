package GeeksForGeeks;

public class FindMissingAndRepeating {
    public static void main(String[] args) {
        int arr[]={1, 3,1};
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int index=Math.abs(arr[i])-1;
            if(arr[index]<0){
                return arr[i]*-1;
            }else{
                arr[index]*=-1;
            }
        }
        for(int item:arr){
            
        }
        return -1;
    }
}
