package GeeksForGeeks;
import java.util.*;
public class GeekandMarks {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int min=in.nextInt();
            int[] marks=new int[n];
            for(int i=0;i<n;i++){
                marks[i]=in.nextInt();
            }
            int count=0;
            for(int i=0;i<n;i++){
                if(min<marks[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
        in.close();
    }
}
