package CollectionFramework.Stacks;
import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> x=new Stack<Integer>();
        x.push(1);
        x.push(2);
        x.push(67);
        x.push(34);
        x.push(346);
        System.out.println(x);
        x.remove(2);
        System.out.println(x);
        System.out.println(x.get(3));

    }
}
