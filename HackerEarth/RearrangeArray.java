package HackerEarth;
import java.util.*;
public class RearrangeArray {
    public static void main(String[] args) {
        int arr[]={22,3,22,34,25,6};
        for(int item:solution(arr,22)){
            System.out.print(item+" ");
        }
    }

    private static int[] solution(int[] arr,int x) {
        int res[]=new int[arr.length];
        int count=0;
        List<Integer> list=new ArrayList<Integer>();
        for(int item:arr){
            if(item==x)count++;
            else list.add(item);
        }
        int p=0;
        for(int i=0;i<arr.length;i++){
            if(i<count)res[i]=1;
            else{
                res[i]=list.get(p++);
            }
        }
        return res;
    }
}
