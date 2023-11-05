package Vit.Java.FileHandling;
import java.net.*;
import java.io.*;
public class Download{
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.google.com/");
            URLConnection connection=url.openConnection();
            InputStream inputStream = connection.getInputStream();
            try(BufferedInputStream in =new BufferedInputStream(inputStream);
            FileOutputStream out = new FileOutputStream("net.html")){
                byte[] bucket = new byte[4096];
                int bytesRead;

                while((bytesRead = in.read(bucket))!=-1){
                    out.write(bucket,0, bytesRead);
                }
            }   
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}