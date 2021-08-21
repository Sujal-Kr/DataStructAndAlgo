package CollectionFramework.Stacks;
import CollectionFramework.LinkedList.MyLinkedList;
public class Mystacks{
    MyLinkedList x = new MyLinkedList();
    void push(int data){
        x.add(data);    
    }
   void pop(){
        x.popping();
    }
    int peek(){
        return x.lastIndex();
    }
    void print(){
        x.print();
        System.out.println();
    }
    public static void main(String[] args){
        Mystacks stack = new Mystacks();
        //Mystacks stack2 =new Mystacks();
        stack.push(34);
        stack.push(45);
        stack.push(56);
        System.out.println("peeked element"+stack.peek());
        stack.print();
        stack.pop();
        System.out.println("peeked element:"+stack.peek());
    }
}