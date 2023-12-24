package GeeksForGeeks;


public class EvenAndOdd {
    public static void main(String[] args){
        int arr[]={3, 6, 12, 1, 5, 8};
        solution(arr);
        for(int item:arr){
            System.out.print(item+" ");
        }
    }

    private static void solution(int[] arr) {
        int odd=1;
        int even =0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2==0){
                if(i%2!=0){
                    int temp=arr[odd];
                    arr[odd]=arr[even];
                    arr[even]=temp;
                    even+=2;
                    
                }
            }else{
                if(i%2==0){
                    int temp=arr[even];
                    arr[even]=arr[odd];
                    arr[odd]=temp;
                    odd+=2;
                }
            }
        }
    }
    
}
