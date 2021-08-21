package PepCoding.Array;

public class Inverse {
    public static void main(String[] args) {
        int[] x={3,4,1,2,0};
        int[] ans=inverse(x);
        for(int item : ans){
            System.out.print(item+" ");
        }
    }

    private static int[] inverse(int[] x) {
        int[] ans=new int[x.length];
        for(int i=0; i<x.length; i++){
            int item=x[i];
            ans[item]=i;
        }
        return ans;
    }
}
