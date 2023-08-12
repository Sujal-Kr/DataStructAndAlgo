
import java.util.Scanner;
public class ProSum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your String");
        String Str=in.nextLine();
        System.out.println("Enter your String");
        String Str1=in.nextLine();
        int x=Integer.parseInt(Str);
        int y=Integer.parseInt(Str1);
        int pro=x*y;
        if(pro%2==0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        in.close();
    }
    
}
