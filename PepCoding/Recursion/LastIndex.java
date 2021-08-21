package PepCoding.Recursion;

public class LastIndex {
    public static void main(String[] args) {
        int[] x={1,2,3,3,7,9,3};
        int last=lastindex(x,0,3);
        System.out.println("last index: " + last);
    }

    private static int lastindex(int[] x, int i, int k) {
        if(i==x.length)return -1;
        int last = lastindex(x,i+1,k);
        if(last==-1){
            if(x[i]==k)return i;
            else return -1;
        }
        else return last;
    }
}
