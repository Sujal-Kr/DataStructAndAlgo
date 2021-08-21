package CollectionFramework.Map;
import java.util.*;
import java.util.Map.Entry;
public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> x=new HashMap<String, Integer>();
        x.put("one", 1);
        x.put("one", 8);
        x.put("eon",7);
        x.put("two",2);
        x.put("three", 3);
        x.put("four", 4); 
        System.out.println(x.get("two"));
        System.out.println(x);
        Set<Entry<String,Integer>> z=x.entrySet();
        System.out.println(z);
        System.out.println(x.values());
        for(Entry<String,Integer> entries:z){
            entries.setValue(entries.getValue()*100);
        }
        System.out.println(z);

    }
}
