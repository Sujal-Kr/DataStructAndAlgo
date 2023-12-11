package Vit.Java.FileHandling;
import java.io.*;
import java.util.*;
public class Error {
    public static void main(String[] args) throws Exception {
        try{
            File file=new File("bro.txt");
            FileWriter writer=new FileWriter(file,true);
            writer.write("hello low blow");
            writer.close();
            Scanner sc=new Scanner(file);
            while(sc.hasNext()){
                System.out.println(sc.next());
            }
            sc.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    }
}
