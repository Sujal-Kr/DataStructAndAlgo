package GeeksForGeeks;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class CountDistinctElement {
    public static void main(String[] args) {
        int x[]={1,2,1,3,4,2,3};
        for(int item:solution(x,4)){
            System.out.print(item+" ");
        }
    }

    private static ArrayList<Integer> solution(int[] x, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Map<Integer,Integer> map =new HashMap<>();
        int remove_element =0;
        for(int i=0;i<x.length;i ++) {
            if(i<k){
                if(map.containsKey(x[i]))map.put(x[i],map.get(x[i])+1);
                else map.put(x[i],1);
            }
            // 1,2,1,3,4,2,3
            else{
                list.add(map.size());
                map.put(x[remove_element],map.get(x[remove_element])-1);
                if(map.get(x[remove_element])==0)map.remove(x[remove_element]);
                if(map.containsKey(x[i]))map.put(x[i],map.get(x[i])+1);
                else map.put(x[i],1);
                remove_element++;
            }
            System.out.println(map);
        }
        list.add(map.size());
        return list;
    }
}
