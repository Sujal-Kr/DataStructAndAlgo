package Vit.Dsa;

public class my_List {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    void add(int data){
        Node newNode = new Node(data);
        Node temp=head;
        if(temp==null){
            head=newNode;
        }else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    void remove_data(int data){
        Node temp=head;
        Node prev=temp;
        if(temp.data==data){
            head=head.next;
        }else{
            while(temp!=null){
                if(temp.data==data){
                    prev.next=temp.next;
                }
                prev=temp;
                temp=temp.next;
            }
        }
    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        my_List myList = new my_List();
        myList.add(3);
        myList.add(44);
        myList.add(34);
        myList.add(23);
        myList.add(12);
        myList.print();
        myList.remove_data(3);
        myList.print();
        myList.remove_data(12);
        myList.print();
        myList.remove_data(34);
        myList.print();

    }
}
