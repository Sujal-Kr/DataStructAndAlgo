package Vit.Java;
abstract class Person{
    int age;
    abstract String fun();
}

public class AbsEx extends Person {
    String fun(){
        String str="papa";
        return str;
    }
    public static void main(String[] args) {
        
    }
}
