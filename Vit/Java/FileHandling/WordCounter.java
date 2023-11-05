package Vit.Java.FileHandling;
import java.io.*;
import java.util.Scanner;
public class WordCounter {
    public static void main(String[] args) {
        String word="that";
        File file = new File("IamDirectory/Demo.txt");
        if(!file.exists()) {
            System.out.println("Invalid Path: "+file.getPath());
        }
        try{
            Scanner in = new Scanner(file);
            int counter=0;
            while(in.hasNext()){
                
                if(word.equals(in.next().toLowerCase())){
                    counter++;
                }
            }
            if(counter!=0){
                System.out.println(word+" occured "+counter+" times");
            }else{
                System.out.println(word+" Not Found!!");
            }
            in.close();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
    
}
