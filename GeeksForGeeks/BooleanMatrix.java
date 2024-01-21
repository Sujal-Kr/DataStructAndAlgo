package GeeksForGeeks;
public class BooleanMatrix{
    public static void main(String[] args) {
        int arr[][]={{1, 0},
        {0, 0}};
        solution(arr);
        for(int[] row:arr){
            for(int item:row){
                System.out.print(item+" ");
            }
            System.out.println();
        }
    }

    private static void solution(int[][] arr) {
        boolean row[]=new boolean [arr.length];
        boolean col[]=new boolean [arr[0].length];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==1){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }

        for(int i=0; i<arr.length;i++){ 
            for(int j=0; j<arr[i].length; j++){
                if(row[i]==true){
                    arr[i][j]=1;
                }else{
                    if(col[j]==true){
                        arr[i][j]=1;
                    }
                }
            }
        }
    }
}