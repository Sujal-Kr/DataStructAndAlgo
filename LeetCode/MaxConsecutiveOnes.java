package LeetCode;
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] x={1,1,0,1,1,1};
        System.out.println(maxone(x));
    }

    private static int maxone(int[] x) {
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<x.length; i++){
            if(x[i]==1)count++;
            if(x[i]!=1){
                max=Math.max(max,count);
                count=0;
            }
        }
        max=Math.max(max,count);
        return max;
    }
}
