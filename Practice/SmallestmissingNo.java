package Practice;
import java.util.*;
public class SmallestmissingNo {
    public static int max(LinkedList<Integer> x) {
        int max=0;
        for(int i=0; i<x.size(); i++){
            if(x.get(i)>max){
                max=x.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Size");
        int n=in.nextInt();
        System.out.println("Elements");
        int[] x=new int[n];
        for(int i=0; i<n; i++){
            x[i]=in.nextInt();
        }
        LinkedList<Integer> pos =new LinkedList<Integer>();
        int min=1;
        for(int i=0;i<n;i++){
            if(x[i]>0){
                pos.add(x[i]);
            }
        }
        int m=max(pos);
        //System.out.println(pos);
        boolean fuck=false;
        for(int i=1;i<=pos.size();i++){
            if(pos.contains(min)){
                min++;
                continue;
            }
            else{
                fuck=true;
                System.out.println(min);
                break;
            }
        }
        if(!fuck){
            System.out.println(++m);
        }

        in.close();
    }
}
