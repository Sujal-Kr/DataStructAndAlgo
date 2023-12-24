package GeeksForGeeks;

public class SmallestSubarray {
    public static void main(String[] args) {
        int[] x= {1, 4, 45, 6, 0, 19};
        int k=51;
        int length=subarraycount(x,k);
        length=solution(x, k);
        System.out.println("length: " + length);
    }

    private static int subarraycount(int[] x, int k) {
        int start=0;
        int end=0;
        int sum=0;
        int min=x.length-1;
        // use two pointer one to calculate sum of all numbers  and iterate and then use the other one to decrease the sum and the find the subarray size by subtracting the both the pointers.....
        
        // this apporach takes O(N) time complexity .
        // sliding window technique.
        while(end<x.length){
            //find the subarray which mee the requirement.
            while(end<x.length &&sum<=k)sum+=x[end++];
            while(start<x.length &&sum>k){
                // now decrease the size and store the minimum length of the subarray
                min=Math.min(min,end-start);
                sum-=x[start++];
            }
            // check this for every subarray which meet the given requirement.
        }
        return min;
    }
    public static int solution(int arr[],int k){
       int start=0;
       int end=0;
       int sum=0;
       int min=arr.length-1;
       
       while(end<arr.length){
            while(end<arr.length &&sum<=k)sum+=arr[end++];
            while(start<arr.length&&sum>k){
                min=Math.min(min,end-start);
                sum-=arr[start++];
            }
       }
       return min;
    }
}
