package GeeksForGeeks;
public class RowWithMaxOne {
    public static void main(String[] args) {
        int arr[][] = { {0, 0, 0, 1},
                        {0, 0, 1, 1},
                        {0, 1, 1, 1},
                        {0, 0, 0, 0}};
        System.out.println(solution(arr));
    }

    private static int solution(int[][] arr) {
        int ans=-1;
        int i=0;
        int j=arr[0].length-1;
        while(i<arr.length&&j>=0){
            if(arr[i][j]==1){
                ans=i;
                j--;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}
