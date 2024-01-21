package GeeksForGeeks;
import java.util.*;
public class CommonElements {
    public static void main(String[] args) {
        int []a = {1, 5, 10, 20, 40, 80};
        int []b = {6, 7, 20, 80, 100};
        int []c= {3, 4, 15, 20, 30, 70, 80, 120};
        System.out.println(solution(a,b,c));
    }

    private static ArrayList<Integer> solution(int[] a, int[] b, int[] c) {
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length&&j<b.length&&k<c.length) {
            if(a[i]==b[j]&&a[i]==c[k]){
                res.add(a[i]);
                while(i<a.length&&a[i]==a[i+1])i++;
                while(j<b.length&&b[j]==b[j+1])j++;
                while(k<c.length&&c[k]==c[k+1])k++;
                i++;
                j++;
                k++;
            }
            else if(a[i]<b[j]&&a[i]<c[k])i++;
            else if(b[j]<a[i]&&b[j]<c[k])j++;
            else k++;
        }
        if(res.isEmpty())res.add(-1);
        return res;
    }
}
