package Vit.CompetativeProgramming;
public class BusCount {
    public static void main(String[] args) {
        int arr[]={3,1,3,3};
        int m=4;
        int busCount=solution(arr,m);
        System.out.println(busCount);
    }
    public static int solution(int[] arr,int m) {
        int temp=m;
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=temp){
                temp-=arr[i];
            }else{
                count++;
                temp=m;
                temp-=arr[i];
            }
        }
        return count;
    }
}
