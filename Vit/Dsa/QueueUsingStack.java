package Vit.Dsa;
import java.util.*;
public class QueueUsingStack {
    Stack<Integer> first=new Stack<Integer>();
    Stack<Integer> second=new Stack<Integer>();
    
    public static void main(String[] args) {    
        
        QueueUsingStack q=new QueueUsingStack();
        
        q.enqueue(0);
        q.enqueue(34);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(54);
        System.out.println(q.dequeue());
    }
    public void enqueue(int data){
        first.push(data);
    }
    public int dequeue(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        return second.pop();
    }
    public void  print(){
        
    }

}
