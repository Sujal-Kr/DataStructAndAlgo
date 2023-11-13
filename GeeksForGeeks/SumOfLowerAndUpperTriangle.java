package GeeksForGeeks;
import java.util.*;
public class SumOfLowerAndUpperTriangle {
    public static void main(String[] args) {
        int arr[][]={{6, 5, 4},{1, 2, 5},{7, 9, 7}};
        System.out.println(solution(arr));
        
    }

    private static ArrayList<Integer> solution(int[][] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int upper=0;
        int lower=0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0;j<=i;j++){
                lower+=arr[i][j];
            }
        }
        for(int i=arr.length-1;i>=0;i--) {
            for(int j=i;j<arr.length;j++){
                upper+=arr[i][j];
            }
        }
        list.add(upper);
        list.add(lower);
        return list;
    }
}
