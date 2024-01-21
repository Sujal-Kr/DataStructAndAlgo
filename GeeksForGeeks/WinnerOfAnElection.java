package GeeksForGeeks;
import java.util.*;
public class WinnerOfAnElection {
    public static void main(String[] args) {
        String arr[] = {"andy","blake","clark"};
        for(String item:solution(arr)){
            System.out.println(item);
        }
    }
    public static String[] solution(String[] arr){
        String ans[]=new String[2];
        int max=-1;
        Map<String,Integer> map=new HashMap<>();
        for(String item:arr){
            if(map.containsKey(item)){
                map.put(item,map.get(item)+1);
            }else map.put(item,1);
            max=Math.max(max,map.get(item));
        }
        ans[0]=arr[0];
        for(String item:map.keySet()){
            if(map.get(item)==max){
                if(ans[0].compareTo(item)>0)ans[0]=item;               
            }
        }
        ans[1]=""+map.get(ans[0]);
        return ans;
    }
}
