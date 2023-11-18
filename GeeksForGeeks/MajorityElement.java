package GeeksForGeeks;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[]={3,1,3,3,2};
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        int curr=0;
        int freq=0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]==arr[curr])freq++;
            else freq--;
            if(freq==0){
                curr=i;
                freq=1;
            }
        }
        freq=0;
        for(int item:arr){
            if(arr[curr]==item)freq++;
        }
        return freq>arr.length/2?arr[curr]:-1;
    }
}
