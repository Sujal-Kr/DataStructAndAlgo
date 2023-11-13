package GeeksForGeeks;
import java.util.*;
public class IsValidSuduko {
    public static void main(String[] args) {
        int mat[][] = { {3, 0, 6, 5, 0, 8, 4, 0, 0},
                        {5, 2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 8, 7, 0, 0, 0, 0, 3, 1},
                        {0, 0, 3, 0, 1, 0, 0, 8, 0},
                        {9, 0, 0, 8, 6, 3, 0, 0, 5},
                        {0, 5, 0, 0, 9, 0, 6, 0, 0},
                        {1, 3, 0, 0, 0, 0, 2, 5, 0},
                        {0, 0, 0, 0, 0, 0, 0, 7, 4},
                        {0, 0, 5, 2, 0, 6, 3, 0, 0}};
        System.out.println(solution(mat));
    }

    private static boolean solution(int[][] mat) {
        for(int i=0; i<mat.length; i++){
            if(!checkRow(mat, i))return false;
            if(!checkCol(mat, i))return false;
        }
        for(int i=0; i<mat.length;i+=3){
            for(int j=0; j<mat.length;j+=3){
                if(!checkBox(mat, i, j))return false;
            }
        }
        return true;
        
    }

    private static boolean checkBox(int[][] mat, int row, int col) {
        Set<Integer> val=new HashSet<>();
        for(int i=row; i<row+3; i++){
            for(int j=col;j<col+3; j++){
                if (mat[i][j]!=0) {
                    if(val.contains(mat[i][j]))return false;
                    else val.add(mat[i][j]);
                }
            }
        }
        return true;
    }

    private static boolean checkCol(int[][] mat, int col) {
        Set<Integer> val = new HashSet<Integer>();
        for(int i=0; i<mat.length; i++){
            if(mat[i][col]!=0){
                if(val.contains(mat[i][col]))return false;
                else val.add(mat[i][col]);
            }
        }
        return true;
    }

    private static boolean checkRow(int[][] mat, int row) {
        Set<Integer> val = new HashSet<Integer>();
        for(int i=0; i<mat.length; i++){
            if(mat[row][i]!=0){
                if(val.contains(mat[row][i]))return false;
                else val.add(mat[row][i]);
            }
        }
        return true;

    }
}
