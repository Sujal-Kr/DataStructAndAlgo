package GeeksForGeeks;
import java.util.Scanner;
public class gog3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any RG String");
        String string1=in.nextLine();
        int R=0;
        int G=0;
        for(int i=0;i<string1.length();i++) {
            if(string1.charAt(i)=='R'){
                R++;
            }
            else{
                G++;
            }
        }
        System.out.println(R+" "+G);
        if(R>G){
            System.out.println(string1.replace('G','R'));
        }
        else{
            System.out.println(string1.replace('R','G'));
        }
        
        in.close();
    }
    
}
