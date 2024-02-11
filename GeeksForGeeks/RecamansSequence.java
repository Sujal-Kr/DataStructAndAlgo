package GeeksForGeeks;
import java.util.*;
public class RecamansSequence{
    public static void main(String[] args) {
       
        for(int item:solution(3)){
            System.out.println(item);
        }
    }
    public static ArrayList<Integer> solution(int n){
        Set<Integer> set=new HashSet<Integer>();
        ArrayList<Integer> res = new ArrayList<>();
        set.add(0);
        res.add(0);
        for(int i=1;i<n;i++){
            int temp=res.get(res.size()-1);
            if(temp-i>0&&!set.contains(temp-i)){
                res.add(temp-i);
                set.add(temp-i);
            }
            else{
                res.add(temp+i);
                set.add(temp+i);
            }
        }
        return res;
    }
}