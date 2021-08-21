package PepCoding.TwoDArray;
public class WaveTraversal{
    public static void main(String[] args) {
        int [][] x={{0,1,2,3},
                    {4,5,6,7},
                    {8,9,5,4}};
        Display(x);
    }

    private static void Display(int[][] x) {
        int row=x.length;
        int col=x[0].length;
        for(int j=0; j<col; j++) {
            if(j%2==0){
                for(int i=0; i<row; i++) {
                    System.out.print(x[i][j]+" ");
                }
            }
            else{
                for(int i=row-1; i>=0; i--) {
                    System.out.print(x[i][j]+" ");
                }
            }
        }
    }
}