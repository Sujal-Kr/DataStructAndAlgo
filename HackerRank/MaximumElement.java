package HackerRank;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
public class MaximumElement{
    public static void main(String[] args) {
        // 1,97,2,1,20,2,1,26,1,20,2,3,1,91,3
        List<String> x=new ArrayList<String>();
        x.add("1 97");
        x.add("2");
        x.add("1 20");
        x.add("2");
        x.add("1 26");
        x.add("1,20");
        x.add("2");
        x.add("3");
        x.add("1 91");
        x.add("3");
        System.out.println(operations(x));
    }

    private static List<Integer> operations(List<String> x) {
        // 1.push
        // 2.pop
        // 3.print the maximum element.
        List<Integer> result = new ArrayList<Integer>();
        Stack<Integer> main = new Stack<>();
        Stack<Integer> sub=new Stack<>();
        sub.push(Integer.MIN_VALUE);
        int max=Integer.MIN_VALUE;
        for(String item:x){
            char temp=item.charAt(0);
            if(temp=='1'){
                main.push(Integer.parseInt(item.substring(2)));
                max=Math.max(sub.peek(),Integer.parseInt(item.substring(2)));
                sub.push(max);
            }   
            if(temp=='2'){
                main.pop();
                sub.pop();
            }
            if(temp=='3'){
                result.add(sub.peek());   
            }
            // System.out.println(sub);
        }
        
        return result;
    }
}