package Vit.Java.FileHandling;
import java.io.*;
import java.util.*;
public class Append {
    public static void main(String[] args) throws Exception {
        File file = new File("yellow.text");
        if(file.exists()) {
            System.out.println("allready");
        }
        Scanner sc=new Scanner(file);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
        System.out.println("________");
        FileWriter writer= new FileWriter(file,true);
        
        writer.write("This is final!\n");
        writer.close();
        sc=new Scanner(file);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
        

    }
}
