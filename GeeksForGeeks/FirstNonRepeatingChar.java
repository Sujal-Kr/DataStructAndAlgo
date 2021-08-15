package GeeksForGeeks;
import java.util.*;
public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String string="aaaabefcc";
        Set<Character> x=new LinkedHashSet<>();
        for(int i=0; i<string.length();i++){
            x.add(string.charAt(i));
        }
        int[] feq=new int[x.size()];
        //System.out.println(x);
        int count=1;
        List<Character> ch=new ArrayList<Character>(x);
        //System.out.println(ch);
        for(int i=0;i<ch.size();i++){
            char temp=ch.get(i);
            for(int j=0;j<string.length();j++){
                if(temp==string.charAt(j)){
                    feq[i]=count++;
                }
            } 
            count=1;
        }
        // for(int i=0;i<feq.length;i++){
        //     System.out.print(feq[i]+" ");
        // }
        for(int i=0;i<feq.length;i++){
            if(feq[i]==1){
                System.out.println(ch.get(i));
                break;
            }
        }
    }
}
