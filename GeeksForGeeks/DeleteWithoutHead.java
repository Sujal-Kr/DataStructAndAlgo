package GeeksForGeeks;

public class DeleteWithoutHead {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        del_node(head.next.next);
        display(head);
    }
    private static void display(Node head) {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    private static void del_node(Node del) {
        del.data = del.next.data;
        del.next=del.next.next;
    }
}
