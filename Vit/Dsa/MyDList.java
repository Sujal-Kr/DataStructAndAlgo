package Vit.Dsa;
import java.util.*;

public class MyDList{
    Node head,tail;
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next=this.prev=null;
        }
    }
    
    public  void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void removeDuplicates(){
        Node first=head;
        if(first==null||first.next==null)return;
        Node second=head.next;
        while(second!=null){
            if(first.data==second.data){
                first.next=second.next;
                second=second.next;
            }
            else{
                first=first.next;
                second=second.next;
            }
        }
    }
    public void removeD(){
        Set<Integer> set= new  HashSet<>();
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            
        }
    }
    public static void main(String[] args) {
        MyDList list=new MyDList();
        list.print();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.removeDuplicates(); // Remove
        list.removeD();
        list.print();

    }
}