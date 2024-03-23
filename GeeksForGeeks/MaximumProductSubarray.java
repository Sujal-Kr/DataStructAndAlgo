package GeeksForGeeks;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int arr[]={2, 3, 4, 5, -1, 0};
        System.out.println(solution(arr));   
        System.out.println(solution2(arr));
        System.out.println(optimised(arr));
        
    }
    private static int solution2(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int pro=1;
            for(int j=i; j<arr.length; j++){
                pro*=arr[j];
                max=Math.max(max,pro);
            }
        }
        return max;
    }
    private static long solution (int[] arr){
        long max=Long.MIN_VALUE;
        long prod=1;
        for(int i=0;i<arr.length;i++){ 
            prod*=arr[i];
            max=Math.max(max,prod);
            if(prod==0)prod=1;
        }
        
        prod=1;
        for(int i=arr.length-1;i>=0;i--){
            prod*=arr[i];
            max=Math.max(max,prod);
            if(prod==0)prod=1;
        }
        return max;
    }
    private static int optimised(int[] arr){
        int max,min,m,temp;
        temp=max=min=m=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>0){
                max=Math.max(arr[i],arr[i]*max);
                min=Math.min(arr[i],min*arr[i]);
            }else if(arr[i]==0){
                max=min=0;
            }else{
                temp=max;
                max=Math.max(arr[i],min*arr[i]);
                min=Math.min(arr[i],temp*arr[i]);
            }
            m=Math.max(m,max);
        }
        return m;

    }
    
}
