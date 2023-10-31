package Practice;
import java.util.*;
public class StaticExp {
    int name;
    StaticExp(){
        System.out.println("constructor");
    }
    static{
        System.out.println("first");
    }
    {
        System.out.println("block");
    }
    static{
        System.out.println("second");
    }
    public void fun(){
        System.out.println("i am fun");
    }
    public static void method(){
        // can't acccess non-static methods and data members
        // name=3;
        // fun();
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(34);
        list.add(45);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        // StaticExp x=new StaticExp();
        System.out.println("main");
    }
}
