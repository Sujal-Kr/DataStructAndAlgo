package GeeksForGeeks;

public class PredictTheColumn {
    public static void main(String[] args) {
        int arr[][] = {{0, 0, 0},{1, 0, 1},{0, 1, 1}};
        System.out.println(solution(arr));

    }

    private static int solution(int[][] arr) {
        
        int row=arr.length;
        int col=arr[0].length;
        int max=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<row;i++){
            int count=0;
            for(int j=0;j<col;j++){
                if(arr[j][i]==0)count++;
            }
            if(count!=0&&max<count){
                max=count;
                index=i;
            }
        }
        return  index;
    }
}
