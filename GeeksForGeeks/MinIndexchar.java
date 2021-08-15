package GeeksForGeeks;
/*package gog;
import java.util.Scanner;
public class MinIndexchar{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter your 1st String");
        String str=in.nextLine();
        System.out.println("Enter your 2nd String");
        String patt=in.nextLine();
        int size=patt.length();
        int []temp = new int[size];
        for(int i=0;i<patt.length();i++){
            for(int j=0;j<str.length();j++){
                if(patt.charAt(i)==str.charAt(j)){
                    temp[i]=j;
                    break;
                }
                else{
                    temp[i]=100;
                }
            }
        }
        int min=Integer.MAX_VALUE;
        int i;
        for(i=0;i<temp.length;i++){
            if(min>temp[i]){
                min=temp[i];
            }
        }
        if(min<temp.length){
            System.out.println(str.charAt(min));
        }
        else{
            System.out.println("no character matched");
        }
        in.close();
    }
}*/