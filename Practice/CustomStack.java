package Practice;

public class CustomStack {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void push(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public int pop(){
        if(head==null){
            System.out.println("underflow");
            return -1;
        }
        if(head.next==null){
            int val=head.data;
            head=null;
            return val;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        int val=temp.next.data;
        temp.next=null;
        return val;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        stack.push(0);
        stack.push(1);
        stack.push(34);
        stack.print();
        System.out.println(stack.pop());
        stack.print();
    }
}
