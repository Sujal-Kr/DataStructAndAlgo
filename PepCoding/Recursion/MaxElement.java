package PepCoding.Recursion;
public class MaxElement {
    public static void main(String[] args) {
        int[] x={1,2,7,8,7};
        System.out.println(max(x, 0));
    }

    private static int max(int[] x, int i) {
        if(i==x.length)return 0;
        int temp=Math.max(x[i],max(x,i+1));
        return temp;  
    }
}
