package Practice;

public class Snippet {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
        for(int[] arr:matrix) {
            for(int item:arr){
                System.out.print(item+" ");
            }
            System.out.println();
        }


        int mat[][]=new int[2][];
        System.out.println(mat[0]);


        String str="fgfg";
        System.out.println(str.contains("f"));
        StringBuilder sb = new StringBuilder("fdfkdfmd,fmlsdmflsmdflmsdlfmslfmsldmflsdmf");
        System.out.println(sb.capacity());
        
    }
}
