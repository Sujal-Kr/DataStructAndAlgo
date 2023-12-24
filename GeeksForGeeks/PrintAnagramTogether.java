package GeeksForGeeks;
import java.util.*;
public class PrintAnagramTogether {
    public static void main(String[] args) {
        String arr[]={"act","god","cat","dog","tac"};
        solution(arr);
        System.out.println("act".toString());
        System.out.println("act".toString());
    }

    private static List<List<String>> solution(String[] arr) {
        Map<String,List<String>> map = new LinkedHashMap<>();
        for(String item:arr){
            char c[] = item.toCharArray();
            Arrays.sort(c);
            String temp=Arrays.toString(c);
            List<String> list=map.getOrDefault(temp,new LinkedList<>());
            list.add(item);
            map.put(temp,list);
        }
        return new LinkedList<>(map.values());
    }
}
