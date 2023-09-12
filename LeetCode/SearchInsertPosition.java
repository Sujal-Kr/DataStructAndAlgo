package LeetCode;
public class SearchInsertPosition{
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        int key=7;
        System.out.println(solution(arr,key));
    }
    public static int solution(int arr[],int key){
        int i=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]>=key)return i;
        }
        return i;
    }
}
