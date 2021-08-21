package CollectionFramework.Deque;
import java.util.ArrayDeque;
public class Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> x=new ArrayDeque<Integer>();
        x.addFirst(1);
        x.addFirst(4);
        x.addLast(90);
        x.addFirst(5);
        x.addFirst(7);
        x.addLast(6);
        x.addLast(3);
        x.addLast(0);
        System.out.println(x);

    }
}
