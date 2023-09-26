package Practice;
public class StaticExp {
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
    public static void main(String[] args) {
        StaticExp x=new StaticExp();
        System.out.println("main");
    }
}
