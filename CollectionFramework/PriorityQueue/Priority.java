package CollectionFramework.PriorityQueue;
import java.util.*;
public class Priority {
    public static void main(String[] args) {
        PriorityQueue<Integer> x=new PriorityQueue<>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        x.add(5);
        x.remove();
        System.out.println(x.element());
        x.remove();
        System.out.println(x.element());

    }
}
