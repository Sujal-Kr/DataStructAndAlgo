package GeeksForGeeks;

public class FindMissingAndRepeating {
    public static void main(String[] args) {
        int arr[]={1, 3,4,4};
        for(int item:solution(arr)){
            System.out.println(item);
        }
    }

    private static int[] solution(int[] arr) {
        int ans[]=new int[2];
        for(int i=0; i<arr.length; i++) {
            int index=Math.abs(arr[i])-1;
            if(arr[index]<0){
                ans[0]=arr[i]*-1;
                break;
            }else{
                arr[index]=-arr[index];
            }
        }
        boolean postive = false;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>0){
                postive = true;
                ans[1]=i-1;
                break;
            }
        }
        if(!postive){
            System.out.println("max+1");
        }
        return ans;
    }
}
