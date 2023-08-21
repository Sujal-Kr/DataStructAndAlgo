package GeeksForGeeks;

public class MinimumNoJump {
    public static void main(String[] args) {
        int arr[]={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(solution(arr));  
    }

    private static int solution(int[] arr) {
        int counter=0;
        int i=0;
        int prev=0;
        while(i<arr.length) {
            counter++;
            prev=i;
            i+=arr[i];
            
            if(i==-1||i>=arr.length-1){
                break;
            }
            if(prev==i){
                return -1;
            }
            
        }
        return counter;
    }
}
