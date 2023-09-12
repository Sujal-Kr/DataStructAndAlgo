package GeeksForGeeks;
public class DeleteANode {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
            this.next =null;
        }
        
    }
    public static void main(String[] args) {

        Node head=new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(9);
        head=deleteNode(head,3);
        display(head);

    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    private static Node deleteNode(Node head, int index) {
        Node temp=head;
        if(index==1)return head.next;
        int i=1;
        index--;
        while(i<index){
            i++;
            temp=temp.next;
        }
        Node newNode=temp.next;
        temp.next=newNode.next;
        return head;
    }
    
    
}
