package Vit.Dsa;
import java.util.*;
public class MyStack {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void push(int data){
        Node x=new Node(data);
        if(head==null){
            head=x;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=x;
        }
    }
    public int pop(){
        Node temp=head;
        if(temp==null){
            System.out.println("underflow");
            return -1;
        }else if(temp.next==null){
            int val=temp.data;
            head=null;
            return val;
        }
        else{
            while(temp.next.next!=null){
                temp=temp.next;
            }
            int val=temp.next.data;
            temp.next=null;
            return val;
        }
    }

    public static void main(String[] args) {
        MyStack stack=new MyStack();
        // stack.print();
        // stack.pop();
        // stack.print();
        stack.push(2);
        stack.push(23);
        stack.push(56);
        // System.out.println(stack.pop());
        stack.print();
        stack.reverse();
        stack.print();
    }
    private void reverse() {
        Node temp=head;
        ArrayList<Integer> list=new ArrayList<>();
        while(temp!=null){
            list.add(temp.data);
            temp=temp.next;
        }
        temp=head;
        int i=list.size()-1;
        while(temp!=null){
            temp.data=list.get(i--);
            temp=temp.next;
        }
    }

}
