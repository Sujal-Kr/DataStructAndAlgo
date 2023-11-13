package GeeksForGeeks;
import java.util.*;
public class SnakePattern {
    public static void main(String[] args) {
        int arr[][] = {{45, 48, 54},{21, 89, 87},{70, 78, 15}};

        System.out.println(solution(arr));
    }

    private static ArrayList<Integer> solution(int[][] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++) {
            if(i%2==0){
                for(int j = 0; j < arr.length;j++){
                    list.add(arr[i][j]);
                }
            }else{
                for(int j = arr.length-1; j >=0; j--){
                    list.add(arr[i][j]);
                }
            }
        }
        return list;
    }
}
