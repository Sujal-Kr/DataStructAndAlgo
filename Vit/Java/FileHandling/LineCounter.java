package Vit.Java.FileHandling;
import java.io.*;
import java.util.Scanner;
public class LineCounter {
    public static void main(String[] args) {
        try{
            File file=new File("IamDirectory/Demo.txt");
            if(!file.exists()){
                System.out.println("Inavlid Path"+file.getPath());
            }
            Scanner in =new Scanner(file);
            int counter=0;
            while(in.hasNextLine()){
                counter++;
                in.nextLine();
            }
            in.close();
            System.out.println("Total no of lines: " + counter);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
