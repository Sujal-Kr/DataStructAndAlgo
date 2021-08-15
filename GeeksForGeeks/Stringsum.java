package GeeksForGeeks;
import java.util.Scanner;
public class Stringsum {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string with few nos. in it.");
        String Str =in.nextLine();
        String temp="0";
        int sum=0;
        for(int i=0;i<Str.length();i++){
            char c = Str.charAt(i);
            if(Character.isDigit(c)){
                temp+=c;
            }
            else{
                sum+=Integer.parseInt(temp);
                temp="0";
            }
        }
		sum=sum+Integer.parseInt(temp);
        System.out.println("Sum of the no's are: " + sum);
        in.close();
    }
}
