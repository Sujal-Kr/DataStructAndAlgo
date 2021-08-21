package CollectionFramework.Queue;
import java.util.Stack;

public class Pq {
    Stack<Integer> Input=new Stack<>();
    Stack<Integer> Output=new Stack<>();
    void Enqueue(int data){
        Input.push(data);
    }
    int Deqeue(){
        int first;
        if(Input.isEmpty()&&Output.isEmpty()){
            return-1;
        }
        else{
            while(!Input.isEmpty()){
                Output.push(Input.peek());
                Input.pop();
            }
            
            first=Output.pop();
            if(Output.isEmpty()){
                return -1;
            }
        }
        return first;
    }
    public static void main(String[] args) {
        Pq x=new Pq();
        x.Enqueue(8);
        x.Enqueue(9);
        x.Deqeue();
        x.Deqeue();
        x.Deqeue();
    }
}
