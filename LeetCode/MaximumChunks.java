package LeetCode;

public class MaximumChunks {
    public static void main(String[] args) {
        int[] x={3,0,1,2,5,4,8,6,7};
        int chunks=chunks_count(x);
        System.out.println("Maximum Chunks: " + chunks);
    }

    private static int chunks_count(int[] x) {
        int count = 0;
        int max=0;
        
        // checking the impact of indices if its not equal to pre max it means count should be increased
        // impact of the elements is equals to element itself since all the elements are from zero to length -1(suffled);
        for(int i=0; i<x.length; i++){
            max=Math.max(max,x[i]);
            if(i==max)count++;
        }
        return count;
    }
}
