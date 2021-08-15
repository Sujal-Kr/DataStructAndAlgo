package HackerRank;
import java.util.Map;
import java.util.HashMap;
public class SalesByMatch{
    public static void main(String[] args) {
        int x[]={10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(countpairs(x));
    }
    public static int countpairs(int []x){
        int count = 0; 
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int item:x){
            if(map.containsKey(item))map.put(item,map.get(item)+1);
            else map.put(item,1);
            if(map.get(item)%2==0)count++;
        }
        return count;
    }
}