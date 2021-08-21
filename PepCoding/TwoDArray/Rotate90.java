package PepCoding.TwoDArray;

public class Rotate90 {
    public static void main(String[] args) {
        int[][] x={{1,2,3,4},{5,6,7,8},{9,10,11,12},{12,13,14,15}};
        for(int[] array:x){
            for(int item:array){
                System.out.print(item+" ");
            }
            System.out.println();
        }
        System.out.println();
        rotate(x);
        for(int[] array:x){
            for(int item:array){
                System.out.print(item+" ");
            }
            System.out.println();
        }
    }

    private static void rotate(int[][] x) {
        // first transpose and then reverse this matrix and display the result
        for(int i=0; i<x.length; i++) {
            for(int j=i; j<x[i].length; j++){
                int temp = x[i][j];
                x[i][j]=x[j][i];
                x[j][i]=temp;
            }
        }
        for(int i=0; i<x.length; i++){
            int f=0;
            int l=x[0].length-1;
            while(f<l){
                int temp = x[i][l];
                x[i][l]=x[i][f];
                x[i][f]=temp;
                f++;
                l--;
            }
        }
    }
}
