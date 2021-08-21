package CollectionFramework.Queue;
import CollectionFramework.LinkedList.MyLinkedList.node;
public class MyQueque {
    node head,rear;
    void enqueue(int data){
        node x=new node(data);
        node temp=head;
        if(temp==null){
            head=x;
            rear=x;
            return;
        }
        rear.next=x;
        rear=rear.next;
    }
    int dequeue(){
        node temp=head;
        if(head==null){
            return 0;
        }
        head=head.next;
        if(head==null){
            rear=null;
        }
        return temp.data;
    }
    int element(){
        return head.data;
    }
    void print(){
        node temp=head;
        if(head==null){
            System.out.println("underflow");
            return;
        }
        System.out.print("["+" ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        MyQueque Q=new MyQueque();
        Q.enqueue(5);
        Q.enqueue(56);
        Q.enqueue(78);
        Q.enqueue(67);
        Q.print();
    }
}
