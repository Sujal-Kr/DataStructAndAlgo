package Vit.CompetativeProgramming;
public class ChineseRemainderTheorem{
    public static void main(String[] args) {
        int rem[]={2,3,2};
        int arr[]={3,5,7};
        System.out.println(solution(arr,rem));
    }

    private static int solution(int[] arr,int[] rem) {
        int ans=1;
        while(true){
            int count=0;
            for(int i=0; i<arr.length; i++){
                if(ans%arr[i]!=rem[i])break;
                count++;
            }
            System.out.println(count);
            if(count==arr.length)return ans;
            ans++;
        }
    }
}