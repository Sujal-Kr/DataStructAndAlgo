package Practice;

import java.util.*;

public class MyDoublyList{
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
        HashSet<Integer> set=new LinkedHashSet<>();
        Node temp=head;
        while(temp!=null){
            set.add(temp.data);
            temp=temp.next;
        }
        head=null;
        for(int item:set){
            add(item);
        }
    }
    
    
    public int size(){
        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    public static void main(String[] args) {
        MyDoublyList list=new MyDoublyList();
        list.print();
        list.add(343333232);
        list.add(3232323);
        list.add(5);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        // list.removeDuplicates(); // Remove
        list.removeD();
        list.print();

    }
}