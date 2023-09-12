package GeeksForGeeks;

public class RemoveDuplicatesFromSortedList {
    static class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(1);
        head.next.next.next= new Node(1);
        head.next.next.next.next= new Node(3);
        head=deleteDuplicate(head);
        display(head);
    }
    private static Node deleteDuplicate(Node head) {
        
        Node first=head;
        Node second=head;
        while(second!=null) {
            while(second!=null&&first.data==second.data){
                second=second.next;
            }
            first.next=second;
            first=second;
        }
        return head;
    }
    private static void display(Node head) {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
        System.out.println();
    }
}
