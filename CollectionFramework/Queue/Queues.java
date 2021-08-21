package CollectionFramework.Queue;
import java.util.Queue;
import java.util.LinkedList;
public class Queues {
    public static void main(String[] args) {
        Queue<Integer> x=new LinkedList<>();
        x.add(7);
        x.add(6);
        x.add(7);
        x.poll();
        System.out.println("QUEUE:"+x);
    }
}
