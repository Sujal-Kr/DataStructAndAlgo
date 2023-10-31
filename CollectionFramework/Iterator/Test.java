package CollectionFramework.Iterator;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator<Integer> it=list.iterator();
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(4);
        q.add(8);
        Set<Integer> set=new HashSet<>();
        for(Integer item:q){
            System.out.println(item);
        }
        set.add(9);
        set.add(10);
        set.add(11);
        for(Integer item:set){
            System.out.println(item);
        }
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(list);
        
    }
}
