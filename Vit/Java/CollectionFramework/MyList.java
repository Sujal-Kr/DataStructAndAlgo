package Vit.Java.CollectionFramework;
import java.util.*;
public class MyList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        // add set get clear remove isEmpt size indexOf 
        list.add(34);
        list.add(10);
        list.add(0);
        list.add(30);
        Collections.sort(list,(a,b)->b-a);
        System.out.println(list);
        list.clear();
        list.add(1);
        list.set(0,59);
        System.out.println(list.isEmpty());
        System.out.println(list);
    }
}
