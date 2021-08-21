package PepCoding.Array;

public class ArrayProduct {
    public static void main(String[] args) {
        int[] x={1,0,3,4,5};
        int[] ans=(solution(x));
        for(int item:ans){
            System.out.print(item+" ");
        }
    }
    // store the right product in an array ans[i]=pro from 0 till i-1* rightx[i+1]
    private static int[] solution(int[] x) {
        int ans[]=new int[x.length];
        int right_pro[]=new int[x.length];
        int pro=1;
        for(int i=x.length-1; i>=0; i--){
            pro*=x[i];
            right_pro[i]=pro;
        }
        pro=1;
        ans[0]=right_pro[1];
        int i;
        for(i=1;i<x.length-1;i++){
            pro*=x[i-1];
            ans[i]=pro*right_pro[i+1];
        }
        ans[x.length-1]=pro*x[i-1];
        return ans;
    }
}
