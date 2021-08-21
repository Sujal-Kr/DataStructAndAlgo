package CollectionFramework.Stacks;
import java.util.Stack;
public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        for(int i=5;i>=1;i--){
            st.push(i);
        }
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }

    private static void reverse(Stack<Integer> st) {
        if(st.isEmpty()) return;
        int temp=st.pop();
        reverse(st);
        insert_at_last(st, temp);
    }

    private static void insert_at_last(Stack<Integer> st, int temp) {
        if(st.isEmpty()){
            st.push(temp);
            return;
        }
        int topelement=st.peek();
        st.pop();
        insert_at_last(st, temp);
        st.push(topelement);
    }
}
