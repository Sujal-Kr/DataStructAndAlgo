package GeeksForGeeks;

public class FrequenciesOfLimitedRangeArrayElements {
    public static void main(String[] args) {
        int arr[]={2, 3, 2, 3, 5};
        solution(arr,5);
        for(int item:arr){
            System.out.print(item+ " ");
        }
    }

    private static void solution(int[] arr,int p) {
        for (int i = 0; i < arr.length; i++) {
            int index=arr[i]-1;
            if(index<=arr.length) {
                arr[index]++;
            }
        }
        // for(int i = 0; i < arr.length; i++) {
        //     int index=arr[i]-1;
        //     arr[index]-=arr[i];
        // }
    }


    
}
