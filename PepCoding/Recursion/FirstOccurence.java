package PepCoding.Recursion;

public class FirstOccurence {
    public static void main(String[] args) {
        int[] x={7,2,7,8,7};
        System.out.println(first(x,0,8));
    }

    private static int first(int[] x,int i ,int k) {
        if(i==x.length)return -1;
        if(x[i]==k){
            return i;
        }
        else{
            return first(x,i+1,k);
        }
   
    }
}
