package Vit.OperatingSystem;
import java.io.File;
public class FileDirectory {
    public static void main(String[] args) {
        String path="GeeksForGeeks";
        File newFile = new File(path);
        if(newFile.exists()&&newFile.isDirectory()) {
            File files[] = newFile.listFiles();
            for(File file : files) {
                System.out.println(file.getName());
            }
        }
    }
}
