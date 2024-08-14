package HackerEarth;

public class Power {
    public static void main(String[] args) {
        int arr[]={2,18,64,32,98};
        int ans=solution(arr);
        System.out.println(ans);
    }
    public static int solution(int[] arr){
        int max=0;
        for(int item:arr){
            int res=Math.pow(item,1/)
            if(res==2){
                max=Math.max(max,res);
            }
        }
        return max;
    }
}
