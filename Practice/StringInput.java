package Practice;

import java.util.*;
public class StringInput {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        in.nextLine();
        String s=in.nextLine();

        System.out.println("int:"+x);
        System.out.println("String "+ s);
        in.close();
    }
}
