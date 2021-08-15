package GeeksForGeeks;
import java.util.Scanner;
class Solution{
    int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
}
public class lagreFactorial {
    public static void main(String[] args) {
        System.out.println("Enter the Size of array:");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int[] a = new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i=0; i<n; i++){
            a[i]= in.nextInt();
        }
        Solution sc= new Solution();
        for(int i=0; i<n; i++){
            System.out.print(sc.fact(a[i])+" ");
        }
        in.close();
    }
}
