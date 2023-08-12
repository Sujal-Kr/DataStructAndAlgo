
//import java.util.Arrays;
public class SortString{
    public static void main(String[] args) {
        String Str="DEFabc";
        String temp=Str;
        String result="";
        Str=Str.toLowerCase();
        char[] ch=Str.toCharArray();
        
        int n=ch.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(ch[j+1]<ch[j]){
                    char Temp=ch[j+1];
                    ch[j+1]=ch[j];
                    ch[j]=Temp;
                }
            }
        }
        //Arrays.sort(ch);
        Str=String.valueOf(ch);
        System.out.println();
        for(int i=0;i<temp.length();i++){
            char c = temp.charAt(i);
            if(Character.isUpperCase(c)){
                result+=Character.toUpperCase(Str.charAt(i));
            }
            else{
                result+=Character.toLowerCase(Str.charAt(i));
            }
        }
        
        System.out.print("Result:"+result);
    
    }
}