

public class Converstion {
    public static void main(String[] args) {
        byte b;
        int i=250;
        double d=323.142;
        System.out.println("Converstion of int to byte");
        b=(byte)i;
        System.out.println("i and b"+i+" "+b);
        System.out.println("Converstion of double to int ");
        i=(int)d;
        System.out.println("d and i"+d+" "+i);
        System.out.println("Converstion of double to byte ");
        b=(byte)d;
        System.out.println("d and b"+d+" "+b);
        
    }

    
}
