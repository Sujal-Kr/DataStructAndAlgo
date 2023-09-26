package Vit.Dsa;

public class Cqueue {
    Node head, rear;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    void push(int data){
        Node newNode = new Node(data);
        if(rear==null){
            head=rear=newNode;
            newNode=head;
        }
        else{
            rear.next = newNode;
            rear=rear.next;
            newNode.next=head;
        }
        
    }
    int pop(){
        int popped = -1;
        if(rear==null){
            throw new Error("Underflow");
        }else{
            popped=head.data;
            if(rear==head){
                head=rear=null;
            }
            else{
                head=head.next;
            }
        }
        return popped;
    }
    void display(){
        Node temp=head;
        while(temp!=null&&temp.next!=head){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Cqueue cq=new Cqueue();
        cq.push(0);
        cq.push(2);
        cq.push(45);
        cq.push(56);
        
        System.out.println(cq.pop());
        cq.display();
        
    }
}
