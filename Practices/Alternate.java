package Practices;
import java.util.Scanner;
public class Alternate {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your String.");
        String temp="";
        String Str=in.nextLine();
        for(int i=0; i<Str.length()-1; i++){
            if(i%2==0){
                temp+=Str.charAt(i);
            }
        }
        System.out.println(temp);
        in.close();
    }
}
