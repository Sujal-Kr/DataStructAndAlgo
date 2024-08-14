package Vit.PlacementTraining;

public class MyCircularList {
    Node head,tail;
    static class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public void add(int data){
        Node x=new Node(data);
        if(head==null){
            head=tail=x;
        }else{
            tail.next=x;
            tail=x;
        }
        tail.next=head;
    }
    public void remove(int data){
        
        if(head==null){
            return ;
        }else if(head.data==data){
            head=tail=null;
        }else{
            Node temp=head;
            while(temp.next!=head&&temp.next.data==data){
                temp=temp.next;
            }
            if(temp.next==tail){
                temp.next=temp.next.next;
                tail=temp;
            }else{
                temp.next=temp.next.next;
            }
        }
    }
    public void print(){
        if(head==null)return;
        Node temp=head;
        while(temp!= head){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        MyCircularList list=new MyCircularList();
        list.add(2);
        list.add(4);
        list.print();
        // list.remove(4);
        list.print();
    }
}
