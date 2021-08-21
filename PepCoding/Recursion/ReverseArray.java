package PepCoding.Recursion;

public class ReverseArray {
    public static void main(String[] args) {
        int[] x={1,2,7,8,9};
        display(x,0);
    }

    private static void display(int[] x, int i) {
        if(i==x.length)return;
        display(x,i+1);
        System.out.print(x[i]+" ");
    }
}
