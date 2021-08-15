package GeeksForGeeks;
class rectangle{
 int length;
 int breadth;

public rectangle(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
}
}
class area{
    public int Calculate_area(rectangle a[]){
        int temp=Integer.MIN_VALUE;
        for(int i = 0; i < a.length;i++) {
            if(temp<a[i].length*a[i].breadth){
                temp=a[i].length*a[i].breadth;
            }
        }
        return temp;
    }
}
public class MaxArea{
    public static void main(String[] args) {
    
        rectangle a[]=new rectangle[3];
        int length=5, breadth=6;
        a[0]=new rectangle(length, breadth);
        length=8; breadth=9;
        a[1]=new rectangle(length, breadth);
        length=6; breadth=6;
        a[2]=new rectangle(length, breadth);
        area obj=new area();
        System.out.println(obj.Calculate_area(a));
    }
}