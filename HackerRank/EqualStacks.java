package HackerRank;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
public class EqualStacks {
    public static void main(String[] args) {
        List<Integer> h1=new ArrayList<>();
        List<Integer> h2=new ArrayList<>();
        List<Integer> h3=new ArrayList<>();
        h1.add(3);
        h1.add(2);
        h1.add(1);
        h1.add(1);
        h1.add(1);
        
        h2.add(4);
        h2.add(3);
        h2.add(2);
        
        h3.add(1);
        h3.add(1);
        h3.add(4);
        h3.add(1);
        
        System.out.println(equalstacks(h1, h2, h3));  
    }

    private static int equalstacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        Stack<Integer> x=new Stack<>();
        Stack<Integer> y=new Stack<>();
        Stack<Integer> z=new Stack<>();
        int sum1=0;
        int sum2=0;
        int sum3=0;
        for(int i=h1.size()-1; i>=0; i--){
            sum1+=h1.get(i);
            x.push(sum1);
        }
        for(int i=h2.size()-1; i>=0; i--){
            sum2+=h2.get(i);            
            y.push(sum2);
        }
        for(int i=h3.size()-1; i>=0; i--){
            sum3+=h3.get(i);
            z.push(sum3);
        }
        // pushing the heigths of the cylinder in the stack and removing the peek element form the tallest most stack and comparaing them with other stacks.
        while(true){
            if(x.isEmpty()||y.isEmpty()||z.isEmpty())return 0;
            int curr1=x.peek();
            int curr2=y.peek();
            int curr3=z.peek();
            if(curr1==curr2&&curr3==curr1)return curr1;
            if(curr1>=curr2&&curr1>=curr3)x.pop();
            else if(curr2>=curr1&&curr2>=curr3)y.pop();
            else if(curr3>=curr1&&curr3>=curr2)z.pop();
        }
    }
}
