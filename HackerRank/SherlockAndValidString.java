package HackerRank;
import java.util.*;
import java.util.Map.Entry;
public class SherlockAndValidString{
    public static void main(String[] args) {
        String s="aabbc";
        String check=isvalid(s);
        System.out.println(check);
    }
    private static String isvalid(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char item = s.charAt(i);
            if(map.containsKey(item))map.put(item,map.get(item)+1);
            else map.put(item,1);
        }
        Set<Integer> x=new HashSet<Integer>(map.values());
        if(x.size()==1)return "YES";
        if(x.size()>=3)return "NO";
        Map<Integer,Integer> most = new HashMap<>();
        int max=Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>(map.values());
        for(int item:list){
            if(most.containsKey(item))most.put(item,most.get(item)+1);
            else most.put(item,1);
            max=Math.max(max,most.get(item));
        }
        int a=0;
        for(int item:list){
            if(most.get(item)==max){
                a=item;
                break;
            }
        }
        Set<Entry<Character,Integer>> z=map.entrySet();
        System.out.println(z);
        System.out.println(map.values());
        for(Entry<Character,Integer> entries:z){
            if(entries.getValue()!=a){
                entries.setValue(entries.getValue()-1);
                if(entries.getValue()==0)map.remove(entries.getKey());
                break;
            }
        }
        System.out.println(map);
        Set<Integer> set = new HashSet<Integer>(map.values());
        if(set.size()==1)return "YES";
        else return "NO";
    }
}
