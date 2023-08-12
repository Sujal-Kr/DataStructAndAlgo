
import java.util.*;
public class TriangesCount {
    static boolean count(int x,int y,int z){

        if(x+y>z&&x+z>y&&z+y>x){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=in.nextInt();
        int[] x=new int[n];
        System.out.println("enter the array elements");
        for(int i=0; i<n; i++){
            x[i]=in.nextInt();
        }
        int c=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                for(int k=0;k<n; k++){
                    if(count(x[i],x[j],x[k])){
                        c++;
                    }
                }
            }
        }
        System.out.println("No of triangles:"+c);
        in.close();
    }
    
}
