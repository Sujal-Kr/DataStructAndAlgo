package Vit.CompetativeProgramming;

public class MaorityVotingAlgorithm {
    public static void main(String[] args) {
        int arr[]={1,5,2,6,5,5,5,5};
        int ans=solution(arr);
        System.out.println(ans);
    }
    public static int solution(int[] arr){
        int freq=1;
        int num=arr[0];
        for(int i=0;i<num;i++){
            if(arr[i]==num)freq++;
            else freq--;
            if(freq==0){
                num=arr[i];
                freq=1;
            }
        }
        int count=0;
        for(int item:arr){
            if(item==num)count++;
        }
        return count>arr.length/2?num:-1;
    }
}
