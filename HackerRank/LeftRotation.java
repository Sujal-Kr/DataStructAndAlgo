package HackerRank;
import java.util.*;
public class LeftRotation {
    public static void main(String[] args) {
        int[]x={1,2,3,4,5};
        int d=2;
        // in this case spliting point is 2 so first elements after spliting points are strored
        //in the new ans array then the intail elements are storefd.
        //so the answer would be 3 4 5 1 2 
        //for rigth rotation reverse the process.

        System.out.println(rotate(x,d));
    }
        //Using split technique to slove this questions .
        //spliting point is equal to b no of rotation.(one index reference)

    private static List<Integer> rotate(int[] x,int d) {
        List<Integer> rotated_arr=new ArrayList<Integer>();
        int point=d;
        //point is equal to no rotation.
        //intial starting elements are after the point d.
        while(point<x.length){
            rotated_arr.add(x[point]);
            point++;
        }
        point =0;
        while(point<d){
            rotated_arr.add(x[point]);
            point++;
        }
        return rotated_arr;
    }
}
