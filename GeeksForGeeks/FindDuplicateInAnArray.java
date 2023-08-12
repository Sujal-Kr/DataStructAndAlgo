package GeeksForGeeks;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class FindDuplicateInAnArray{
    public static void main(String[] args) {
        int arr[]={0,3,1,2};
        System.out.println(solution(arr));
    }
    public static ArrayList<Integer> solution(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int item:arr){
            if(map.containsKey(item)){
                map.put(item,map.get(item)+1);
            }
            else{
                map.put(item,1);
            }
        }
        for(int item:arr){
            if(map.get(item)>1&&!list.contains(item)){
                list.add(item);
            }
        }
        if(list.size()==0)list.add(-1);
        return list;
    }
}