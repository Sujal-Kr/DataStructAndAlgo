package Test;

public class MangoTree {
    public static void main(String[] args) {
        boolean ans=solution(5,5,11);
        System.out.println(ans);
    }
    private static boolean solution(int row, int col,int k) {
        int ans=(2*row) +col-2;
        return ans>k?true:false;
    }
}
