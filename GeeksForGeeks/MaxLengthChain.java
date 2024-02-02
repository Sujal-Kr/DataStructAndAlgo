package GeeksForGeeks;
import java.util.*;
public class MaxLengthChain{
    public static class pair{
        int x;
        int y;
        pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        int arr[]={5 , 24 , 39, 60 , 15, 28 , 27, 40 , 50, 90};
        System.out.println(soluion(arr));
    }

    private static int soluion(int[] arr) {
        ArrayList<pair> list=new ArrayList<>();
        for(int i=0; i<arr.length; i+=2){
            list.add(new pair(arr[i],arr[i+1]));
        }
        Collections.sort(list,(a,b)->a.y-b.y);
        
        int len=1;
        pair curr=list.get(0);
        for(int i=1; i<list.size(); i++){
            if(curr.y<list.get(i).x){
                len++;
                curr=list.get(i);
            }
        }
       return len;
    }
}