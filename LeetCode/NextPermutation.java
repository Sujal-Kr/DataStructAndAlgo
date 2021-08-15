package LeetCode;

import java.util.Arrays;

public class NextPermutation{
    public static void main(String[] args) {
        int nums[]= {1,3,2};
        nextpermutation(nums);
        for(int item:nums){
            System.out.print(item+" ");
        }
    }
    private static void nextpermutation(int[] nums) {
        int i=nums.length-2;
        int j=nums.length-1;
        while(i>=0&&nums[i]>=nums[i+1])i--;
        if(i==-1){
            Arrays.sort(nums);
            return;
        }
        while(nums[i]>=nums[j])j--;
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        Arrays.sort(nums,i+1,nums.length);
    }
}
