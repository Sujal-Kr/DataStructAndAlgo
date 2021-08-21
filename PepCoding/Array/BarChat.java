package PepCoding.Array;
public class BarChat {
    public static void main(String[] args) {
        int[] x={3,1,0,7,5};
        bar(x);
    }

    private static void bar(int[] x) {
        int max=Integer.MIN_VALUE;
        for(int item : x){
            if(item > max)max=item;
        }
        System.out.println(max);
        for(int i=max;i>=1;i--){
            for(int item:x){
                if(item>=i){
                    System.out.print("*"+" ");
                }
                else System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
