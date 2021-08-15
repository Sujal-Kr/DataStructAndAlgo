package LeetCode;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int [] water={1,8,6,2,5,4,8,3,7};
        int area=solution(water);
        System.out.println("Maximum area of the water: " + area);
        area= maxwater(water);
        System.out.println("Maximum area of the water: " + area);
    }
    //optimised solution O(N)
    private static int maxwater(int[] water) {
        int i=0;
        int j=water.length-1;
        int area=0;
        int max=0;
        while(i<j){
            area=Math.min(water[i], water[j])*(j-i);
            max=Math.max(max,area);
            if(water[j]>water[i])i++;
            else j--;
        }
        return max;
    }
    // brute force time limit exeeded...
    public  static int solution(int[] water) {
        int area=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<water.length; i++){
            for(int j=0; j<water.length; j++){
                area=Math.min(water[i], water[j])*(j-i);
                max=Math.max(max,area);
            }
        }
        return max;
    }
}
