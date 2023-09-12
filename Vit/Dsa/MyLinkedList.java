package Vit.Dsa;

public class MyLinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data){
        Node temp=head;
        if(temp==null){
            head=new Node(data);
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(data);
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void insert(int index,int data){
        Node temp=head;
        Node newNode=new Node(data);
        if(index==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        int i=0;
        while(i<index){
            i++;
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void delete(int index){
        Node temp=head;
        if(index==0)head=head.next;
        else{
            int i=1;
            while(i<index){
                i++;
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
    }
    public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList();
        list.insert(5);
        list.insert(6);
        list.insert(0);
        list.insert(44);
        list.delete(3);
        list.display();
        

    }
}
