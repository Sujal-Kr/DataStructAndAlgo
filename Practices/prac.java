package Practices;

import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your String.");
        String Str=new String(in.nextLine());
        System.out.println("your String is "+ Str);
        Str=Str.replace('s','0');
        System.out.println(Str);
        in.close();
    }
    
}
