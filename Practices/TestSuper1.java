
class A{
    String color="white";
}
class B extends A{
    String color="black";
    void printcolor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class TestSuper1 {
    public static void main(String[] args) {
        B obj=new B();
        obj.printcolor();
    }
}
