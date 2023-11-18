package GeeksForGeeks;

public class ReverseLinkedList {
    public  static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(12);
        head.next=new Node(23);
        head.next.next=new Node(45);
        head.next.next.next=new Node(10);
        head.next.next.next.next=new Node(100);
        print(head);
        head=reverse(head);
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
    private static Node reverse(Node head){
        if(head==null||head.next==null)return head;
        Node curr=head;
        Node temp;
        Node prev=null;
        while(curr!=null){
            // revere
            temp=curr.next;
            curr.next=prev;

            // update
            prev=curr;
            curr=temp;
        }
        return prev;
    }

}
