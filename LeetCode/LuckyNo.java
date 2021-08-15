package LeetCode;
import java.util.*;
public class LuckyNo {
    public static void main(String[] args) {
        int[][] x={{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.println(solution(x));
         List<Integer> r_min=new ArrayList<Integer>();
        List<Integer> c_max=new ArrayList<Integer>();
        int row=x.length;
        int col=x[0].length;
        int min;
        for(int i=0; i<row; i++){
            min=Integer.MAX_VALUE;
            for(int j=0; j<col; j++){
                if(min>x[i][j])min=x[i][j];
            }
            r_min.add(min);
        }
        int max;
        for(int j=0; j<col; j++){
            max=Integer.MAX_VALUE;
            for(int i=0; i<row; i++){
                if(max<x[i][j])max=x[i][j];
            }
            c_max.add(max);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<r_min.size(); i++){
            if(c_max.contains(r_min.get(i))){
                ans.add(r_min.get(i));
            }
        }
    }
    //05313403889
    private static List<Integer> solution(int[][] x) {
        List<Integer> r_min=new ArrayList<Integer>();
        List<Integer> c_max=new ArrayList<Integer>();
        int row=x.length;
        int col=x[0].length;
        int min;
        for(int i=0; i<row; i++){
            min=Integer.MAX_VALUE;
            for(int j=0; j<col; j++){
                if(min>x[i][j])min=x[i][j];
            }
            r_min.add(min);
        }
        int max;
        for(int j=0; j<col; j++){
            max=Integer.MIN_VALUE;
            for(int i=0; i<row; i++){
                if(max<x[i][j])max=x[i][j];
            }
            c_max.add(max);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<r_min.size(); i++){
            if(c_max.contains(r_min.get(i))){
                ans.add(r_min.get(i));
            }
        }
        return ans;
    }
}
