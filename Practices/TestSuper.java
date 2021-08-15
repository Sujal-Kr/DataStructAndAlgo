package Practices;
class Abc{
    Abc(){
        System.out.println("A is created");
    }
}
class Bc extends Abc{
    int x;
    Bc(){
        super();
        System.out.println("B is created");
    }
}
public class TestSuper {
    public static void main(String[] args) {
        Bc obj=new Bc();
        obj.x=1;
    }
}
