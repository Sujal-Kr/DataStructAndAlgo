package GeeksForGeeks;

public class RotateBy90 {
    public static void main(String[] args) {
        int arr[][]={{1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};
        solution(arr);
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static void solution(int arr[][]) {
        // transpose of matrix
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        
        for(int j=0; j<arr.length; j++) {
            int h=0;
            int k=arr.length-1;
            while(h<k){
                int temp=arr[h][j];
                arr[h][j]=arr[k][j];
                arr[k][j]=temp;
                h++;
                k--;
            }

        }
        
    }
}
