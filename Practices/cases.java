
import java.util.Scanner;
public class cases {
    public static void main(String[] args) {
        System.out.println("Enter your String:");
        Scanner in=new Scanner(System.in);
        boolean visited=false;
        String Str=in.nextLine();
        for(int i=0;i<Str.length();i++){
            char ch=Str.charAt(i);
            {
                if(Character.isUpperCase(ch)){
                    System.out.print(Str.charAt(i)+" ");
                    visited=true;
                }
            }
        }
        if(!visited){
            System.out.println("no uppercase element.");
        }
        in.close();
    }
}
