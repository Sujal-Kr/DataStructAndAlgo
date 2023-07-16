package GeeksForGeeks;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class QueueReversal{
    public static void main(String[] args) {
        Queue<Integer> x=new LinkedList<>();
        int arr[]={4, 3, 1, 10, 2, 6};
        for(int  item:arr){
            x.add(item);
        }
        System.out.println(solution(x));
    }

    private static Queue<Integer> solution(Queue<Integer> x) {
        Stack<Integer> temp=new Stack<>();
        while(!x.isEmpty()){
            temp.push(x.remove());
        }
        while(!temp.isEmpty()){
            x.add(temp.pop());
        }
        return x;
    }
}
