package CollectionFramework.Map;
import java.util.Map;
// import java.util.TreeMap;
import java.util.HashMap;
import java.util.ArrayList;
public class Duplicates{
    public static void main(String[] args) {
        int[] a={13,9,25,1,1,0,22,13,22,20,3,8,11,25,10,3,1,5,11,19,20,2,4,25,14,23,14};
        ArrayList<Integer> res=new ArrayList<Integer>();
        Map<Integer, Integer> x=new HashMap<Integer, Integer>();
        for(int i=0; i<a.length; i++){
            if(!x.containsKey(a[i])){
                x.put(a[i],a[i]);
            }
            else{
                if(!res.contains(a[i]))
                res.add(a[i]);
            }
        }
        System.out.println(x);
        System.out.println(res);
    }
}