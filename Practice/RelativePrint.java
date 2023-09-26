package Practice;

import java.util.Scanner;
public class RelativePrint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your String");
        String s=in.nextLine();
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(Character.isUpperCase(c[i])){
                int temp=(int)c[i];
                //Ascii vsluen of A+Z= 162.
                temp=162-temp;
                //type casting.
                c[i]=(char)temp;
            }
            else{
                int temp=(int)c[i];
                //Ascii value od a+z=219.
                temp=219-temp;
                //type casting 
                c[i]=(char)temp;
            }
        }
        s=String.valueOf(c);
        System.out.println(s);
        in.close();
    }
    
}
