package HackerRank;
import java.util.*;
public class DesignerPDFViewer {
    public static void main(String[] args) {
        int[] heigth ={1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,7};
        List<Integer> h=new ArrayList<Integer>();
        String str="zaba";
        System.out.println("Code equlas to"+str);
        for(int i=0;i<heigth.length;i++){
            h.add(heigth[i]);
        }
        System.out.println(h);
        int alpha=97;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<heigth.length;i++){
            map.put((char)alpha++,heigth[i]);
        }
        System.out.println(map);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<str.length();i++){
            if(max<map.get(str.charAt(i))){ 
                max=map.get(str.charAt(i));
            }
        }
        System.out.println(max);
        int ans=max*str.length();
        System.out.println("Answer of the given solution is " +(ans));
    }
}
