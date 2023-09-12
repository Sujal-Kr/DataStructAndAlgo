package GeeksForGeeks;

public class Sort0s1s2s {
    public static void main(String[] args) {
        int arr[]={0 ,2, 1, 2, 0};
        solution(arr);
        for(int item:arr){
            System.out.print(item+" ");
        }
    }

    private static void solution(int[] arr) {
        int count_0=0;
        int count_1=0;
        int count_2=0;
        for(int item:arr){
            if(item==0)count_0++;
            else if(item==1)count_1++;
            else count_2++;
        }
        int i=0;
        while(count_0>0){
            arr[i++]=0;
            count_0--;
        }
        while(count_1>0){
            arr[i++]=1;
            count_1--;
        }
        while(count_2>0){
            arr[i++]=2;
            count_2--;
        }

    }
}
