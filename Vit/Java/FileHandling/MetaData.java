package Vit.Java.FileHandling;
import java.util.Scanner;
import java.io.*;
import java.util.Date;


public class MetaData {
    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the path to your file:");
        String path=in.nextLine();
        try{
            File file = new File(path);
            if(!file.exists()){
                System.out.println("Invalid Path");
                System.exit(0);
            }
            System.out.println("File Information: " );
            System.out.println("File Size: " + file.length());
            System.out.println("Last Modified: " +new Date(file.lastModified()));
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Is File: "+file.isFile());
            System.out.println("Is Hidden: "+file.isHidden());
            System.out.println("Parent Directory: " + file.getParent());
            System.out.println("Is Absolute: "+file.isAbsolute());
            System.out.println("Path: "+file.getPath());

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        in.close();
    } 
}
