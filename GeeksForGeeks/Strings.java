// seven and four problem of a string ...
package GeeksForGeeks;
import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        System.out.println("Enter the string with only four and seven:");
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();
        System.out.println("Enter the String :");
        String no=in.nextLine();
        System.out.println(no);
        String[] String1=input.split(",");
        for(int i=0; i<String1.length; i++){
            System.out.println(String1[i]+" ");
        }
        in.close();
    }
    
}
