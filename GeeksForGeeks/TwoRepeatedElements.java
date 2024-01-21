package GeeksForGeeks;

public class TwoRepeatedElements {
    public static void main(String[] args) {
        int arr[]={1,2,2,1};
        for(int item:solution(arr)){
            System.out.println(item);
        }
    }

    private static int[] solution(int[] arr) {
        int ans[]=new int[2];
        int p=0;
        for(int i=0; i<arr.length; i++) {
            int index=Math.abs(arr[i])-1;
            if(arr[index]<0){
                ans[p++]=index+1;
            }
            else arr[index]=-arr[index];
            if(ans[1]!=0)break;
        }
        return ans;
    }
}
