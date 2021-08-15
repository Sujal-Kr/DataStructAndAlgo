package HackerRank;
import java.util.*;
public class Sparse {
    public static void main(String[] args) {
        List<String> string=new ArrayList<>();
        List<String> queries=new ArrayList<>();
        
        string.add("def");
        string.add("de");
        string.add("fgh");
        queries.add("def");
        queries.add("lmn");
        queries.add("fgh");
        System.out.println(solution(string, queries));
    }

    private static List<Integer> solution(List<String> string, List<String> queries) {
        List<Integer> ans=new ArrayList<Integer>();
        
        for(String item:queries){
            int count=0;
            for(int i=0;i<string.size();i++){
                if(item.equals(string.get(i)))count++;
            }
            ans.add(count);
        }
        return ans;
    }
}
