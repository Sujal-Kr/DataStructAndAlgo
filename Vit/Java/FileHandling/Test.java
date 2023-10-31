package Vit.Java.FileHandling;
import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        File file=new File("new.text");
        if(file.exists()) {
            System.out.println("allready exists");
        }
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.isAbsolute());
        System.out.println(file.isDirectory());
        System.out.println(file.getParentFile());
        System.out.println(file.isHidden());
        System.out.println(file.getAbsolutePath());
        
        PrintWriter writer=new PrintWriter(file);
        writer.print("It is a new file");
        writer.println(45);
        writer.close();
        Scanner sc=new Scanner(file);
        while(sc.hasNext()){
            System.out.println(sc.next());
        }
        sc.close();   
    }
}
