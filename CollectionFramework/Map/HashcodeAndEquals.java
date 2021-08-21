package CollectionFramework.Map;
import java.util.HashSet;
import java.util.Set;

public class HashcodeAndEquals {
    public static void main(String[] args) {
        pen pen1=new pen(10,"black");
        pen pen2=new pen(10,"black");
        pen pen3=pen1;
        System.out.println(pen1.equals(pen2));//different refrence.
        System.out.println(pen1.equals(pen3));//same References.
        System.out.println("after overriding");
        Set<pen> pens=new HashSet<pen>();
        pens.add(pen1);
        pens.add(pen2);
        System.out.println(pen1.hashCode());
        System.out.println(pen2.hashCode());
        System.out.println(pens);
        //still we get both the pen and because they have different hashcode...

    }

}
class pen{
    int price;
    String Colour;
    public pen(int price,String Colour){
        this.price = price;
        this.Colour = Colour;
    }
    // @Override
    // public boolean equals(Object x){
    //     pen that = (pen)x;
    //     boolean isequals=this.price==that.price&&this.Colour.equals(that.Colour);
    //     return isequals;
    // }
    // @Override
    // //after overriding we get only one pen which we wanted.
    // public int hashCode(){
    //     return this.price+this.Colour.hashCode();
    // }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Colour == null) ? 0 : Colour.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        pen other = (pen) obj;
        if (Colour == null) {
            if (other.Colour != null)
                return false;
        } else if (!Colour.equals(other.Colour))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
        
}
