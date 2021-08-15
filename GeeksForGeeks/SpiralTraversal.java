package GeeksForGeeks;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraversal {
    public static void main(String[] args) {
        // int r = 4, c = 4;
        int matrix[][]={{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}};
        System.out.println(spiraldisplay(matrix));
    }

    private static List<Integer> spiraldisplay(int[][] x) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int minc=0;
        int maxc=x[0].length-1;
        int minr=0;
        int maxr=x.length-1;
        int total=x.length*x[0].length;
        int count=0;
        while(count<total){
            for(int i=minr,j=minc;j<=maxc&&count<total; j++){
                result.add(x[i][j]);
                count++;
            }
            minr++;
            for(int i=minr,j=maxc;i<=maxr&&count<total;i++){
                result.add(x[i][j]);
                count++;
            }
            maxc--;
            for(int i=maxr,j=maxc;j>=minc&&count<total;j--){
                result.add(x[i][j]);
                count++;
            }
            maxr--;
            for(int i=maxr,j=minc;i>=minr&&count<total;i--){
                result.add(x[i][j]);
                count++;
            }
            minc++;
        }
        return result;
    }
}
