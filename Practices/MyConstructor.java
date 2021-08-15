package Practices;
class Perimeter{
    int length;
    int breadth;
    Perimeter(){
        length=0;
        breadth=0;
    }
    Perimeter(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    void calculate(){
        int peri=2*(length+breadth);
        System.out.println(peri);
    }

}
public class MyConstructor {
    public static void main(String[] args) {
        Perimeter object=new Perimeter();
        object.calculate();
        Perimeter x=new Perimeter(5,6);
        x.calculate();
    }
    
}
