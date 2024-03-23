package GeeksForGeeks;
public class PrintMatrixInDiagonalPattern{
    public static void main(String[] args) {
        int arr[][]={{1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};
        solution(arr);
    }

    public static void solution(int[][] arr) {
        int flag=1;
        int row=arr.length;
        int col=arr[0].length;
        int i=0;
        int j=0;
        while(i<row &&j<col) {
            if(flag==1) {
                while(i!=0){
                    System.out.print(arr[i][j]+" ");
                    j++;
                    i--;
                }
                flag = 0;
            }else{
                while(j!=col){
                    System.out.print(arr[i][j]+" ");
                    j--;
                    i++;
                }
                flag = 1;
            }
        }
    }
}