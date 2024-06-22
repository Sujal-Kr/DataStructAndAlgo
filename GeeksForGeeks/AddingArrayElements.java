package GeeksForGeeks;
import java.util.*;
public class AddingArrayElements {
    public static void main(String[] args) {
        int arr[]={6 ,3 ,7 ,1 ,5 ,8 ,9 ,6, 8};
        System.out.println(solution(arr,3));
    }
    public static int solution(int arr[],int k){
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int item:arr)q.add(item);
        int count=0;
        while(q.peek()<k){
            if(q.size()==1&&q.peek()<k)return -1;
            int a=q.remove();
            int b=q.remove();
            q.add(a+b);
            count++;
        }
        return count;
    }
}
