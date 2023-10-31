package Practice;
import java.util.*;
public class DuplicateNums {
    public static void main(String[] args) {
        int nums[]={1,1,4,2,3,5};
        System.out.println(solution(nums));
    }

    private static ArrayList<Integer> solution(int[] nums) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++) {
            int index=nums[i]-1;
            System.out.println(index);
            nums[index] = -nums[index];
        }
        for(int item:nums){
            System.out.print(item+"");
        }
        return null;
    }
}
