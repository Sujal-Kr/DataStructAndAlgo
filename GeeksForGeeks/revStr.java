package GeeksForGeeks;
import java.util.Scanner;
public class revStr {
    public static void main(String[] args) {
        Scanner in =new  Scanner(System.in);
        System.out.println("Enter your String.");
        String Str=in.nextLine();
        int n=Str.length();
        String temp="";
        for(int i=n-1; i>=0; i--){
            temp=temp+Str.charAt(i);
        }
        System.out.println("Reversed String: " + temp);
        in.close();
    }
}
