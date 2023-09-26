package Vit.Dsa;

public class Output {
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        fun(head);
    }
    private static void fun(Node head) {
        if(head==null)
             return;
        System.out.println(head.data);
        if(head.next!=null)
            fun(head.next.next);
        System.out.println(head.data);
    }
}
