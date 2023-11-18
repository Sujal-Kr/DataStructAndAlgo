/**
 * The class `MyDoublyList` is a Java implementation of a doubly linked list, with methods to add
 * elements, traverse the list in both forward and reverse order, and a main method to demonstrate the
 * functionality.
 */
package Vit.Dsa;

public class MyDoublyList {
    Node head,tail;
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            next=prev=null; 
        }
    }
    void revere(){
        Node curr=head;
        Node prev=null;
        Node after;
        while(curr!=null){
            // reverse 
            after=curr.next;
            curr.next=prev;
            curr.prev=after;

            // update
            prev=curr;
            curr=after;
        }
        head=prev;
    }
    void add(int data){
        Node newNode = new Node(data);
        Node temp=head;
        if(temp==null){
            head=tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    void reverseTraversal(){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    void travesal(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        MyDoublyList list=new MyDoublyList();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(3,45);
        list.add(7);
        // list.travesal();
        list.revere();
        // list.travesal();

    }
    /**
     * The add function inserts a new node with the given data at the specified index in a doubly
     * linked list.
     * 
     * @param index The index parameter represents the position at which the new node should be
     * inserted in the linked list.
     * @param data The data parameter is an integer value that represents the data to be added to the
     * linked list.
     */
    private void add(int index, int data) {
        Node newNode=new Node(data);
        Node temp=head;
        if(index==0){
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        else{
            int i=1;
            while(i<index){
                System.out.println(i+" "+temp.data+"");
                i++;
                temp=temp.next;
            }
            if(temp.next==null){
                tail.next=newNode;
                newNode.prev=tail;
                tail=newNode;
                return;
            }
            Node second=temp.next;
            temp.next=newNode;
            newNode.next=second;
            newNode.prev=temp;
            second.prev=newNode;
            
        }
    }
}
