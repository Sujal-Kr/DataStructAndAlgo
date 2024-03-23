package Vit.CompetativeProgramming;

public class LeadersInArray {
    public static void main(String[] args) {
        int arr[]={16,17,2,3,1,0};
        // solution(arr);
        optimised(arr);
    }

    private static void optimised(int[] arr) {
        int max=arr[arr.length-1];
        System.out.println(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--) {
            if(arr[i]>max) {
                max=arr[i];
                System.out.println(arr[i]);
            }
        }
    }

    public static void solution(int[] arr) {
        
        for(int i=0; i<arr.length; i++){
            boolean leader=true;
            for(int j=i+1; j<arr.length-1;j++){
                if(arr[i]<=arr[j]){
                    leader=false;
                    break;
                }
            }
            if(leader)System.out.println(arr[i]);
        }
    }

}
