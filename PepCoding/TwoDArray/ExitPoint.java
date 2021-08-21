package PepCoding.TwoDArray;

public class ExitPoint {
    public static void main(String[] args) {
        int x[][]={{0,0,1,0},{1,0,0,0},{0,0,0,0},{1,0,1,0}};
        exitpoint(x);
    }

    private static void exitpoint(int[][] x) {
        int i=0;
        int j=0;
        int dir=0;
        while(true){
            dir=(dir+x[i][j])%4;
            if(dir==0)j++;
            else if(dir==1)i++;
            else if(dir==2)j--;
            else if(dir==3)i--;
            if(i<0){
                i++;
                break;
            }
            else if(i==x.length){
                i--;
                break;
            }
            else if(j<0){
                j++;
                break;
            }
            else if(j==x[0].length){
                j--;
                break;  
            }
        }
        System.out.println(i+","+j);
    }
}