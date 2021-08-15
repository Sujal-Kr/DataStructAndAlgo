package GeeksForGeeks;
import java.util.*;
public class LargestNumPossible {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=in.nextInt();
        String[] no =new String[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size; i++){
            no[i]=in.next();
        }
        Arrays.sort(no,new Comparator<String>(){
            @Override 
            public int compare(String x, String y){
                String xy = x+y;
                String yx = y+x;
                return yx.compareTo(xy);
            }
        });
        String ans="";
        for(int i=0;i<no.length;i++){
            ans+=no[i];
        }
        System.out.println("Largest no which can be formed from the given array is :"+ans);
        in.close();
    }
}
