package Vit.Dsa;
public class MergeList{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public static void main(String[] args) {

        Node list1=new Node(10);
        list1.next=new Node(20);
        list1.next.next=new Node(30);
        list1.next.next.next=new Node(40);
        list1.next.next.next.next=new Node(50);
        
        Node list2=new Node(90);
        list2.next=new Node(100);
        list2.next.next=new Node(200);
        list2.next.next.next=new Node(300);
        
        Node head=mergeList(list1,list2);
        print(head);

    }
    private static void print(Node head) {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    private static Node mergeList(Node list1, Node list2) {
        Node temp1=list1;
        Node temp2=list2;
        Node head=new Node(-1);
        Node temp=head;
        int size1=size(list1);
        int size2=size(list2);
        int i=0;
        while(i<Math.min(size1,size2)){
            i++;
            temp.next=new Node(temp1.data);
            temp=temp.next;
            temp.next=new Node(temp2.data);
            temp=temp.next;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        
        while(i<size1){
            temp.next=new Node(temp1.data);
            temp=temp.next;
            temp1=temp1.next;
            i++;
        }
        while(i<size2){
            temp.next=new Node(temp2.data);
            temp=temp.next;
            temp2=temp2.next;
            i++;
        }
        return head.next;
    }

    private static int size(Node head) {
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        return size;
    }
}