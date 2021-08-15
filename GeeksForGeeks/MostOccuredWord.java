package GeeksForGeeks;
import java.util.*;
public class MostOccuredWord {
    public static void main(String[] args) {
        String[] words={"geeks","for"};
        System.out.println("most frequently used word is:"+solution(words));
    }
    //have you ever heard  luffy singing..
    private static String solution(String[] words) {
        int max=Integer.MIN_VALUE;
        Map<String,Integer> map=new HashMap<String,Integer>();
        for(String item:words) {
            if(map.containsKey(item))map.put(item,map.get(item)+1);
            else map.put(item,1);
            max=Math.max(max,map.get(item));
        }
        List<String> x=new ArrayList<String>();
        for(String item:words){
            if(map.get(item)==max){
                if(!x.contains(item))x.add(item);
            }
        }
        return x.get(x.size()-1);
    }
}
