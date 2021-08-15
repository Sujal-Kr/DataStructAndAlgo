package HackerRank;
import java.util.*;
public class JesseAndCookies {
    public static void main(String[] args) {
        List<Integer> cookies = new ArrayList<Integer>();
        // cookies.add(1);
        // cookies.add(2);
        // cookies.add(3);
        // cookies.add(9);
        // cookies.add(10);
        // cookies.add(12);
        cookies.add(1);
        cookies.add(1);
        cookies.add(1);
        int k=10;
        // X Factor missing or may be user is crazy...
        System.out.println(soluiton(cookies,k));
    }
    public static int soluiton(List<Integer> cookies,int k) {
        int count=0;
        PriorityQueue<Integer> x=new PriorityQueue<Integer>();
        for(int i=0;i<cookies.size();i++){
            x.add(cookies.get(i));
        }
        if(x.peek()>=k){
            return 0;
        }
        while(x.peek()<k){
            int update=0;
            if(x.peek()<k){
                count++;
                if(x.size()<=2)return -1;
                update=sweet(x.remove(),x.remove());
            }
            else{
                break;
            }
            x.add(update);
        }
        return count;
    }
    public static int sweet(int a,int b){
        return 1*a+2*b;
        
    }
}
