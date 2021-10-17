package GeeksForGeeks;

public class SegregateOddAndEven{
    static class  Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        // 17 -> 15 -> 8 -> 9 -> 2 -> 4 -> 6 -> NULL
        Node head=new Node(17);
        head.next=new Node(15);
        head.next.next=new Node(8);
        head.next.next.next=new Node(9);
        head.next.next.next.next=new Node(2);
        head.next.next.next.next.next=new Node(4);
        head.next.next.next.next.next.next=new Node(6);
        Node ans=divide(head);
        while(ans!=null){
            System.out.print(ans.data+" ");
            ans=ans.next;
        }
    }
    public static Node divide(Node head){
        Node odd=new Node(0);
        Node even=new Node(0);
        Node temp=head;
        Node temp1=even;
        Node temp2=odd;
        while(temp!=null){
            if(temp.data%2==0){
                temp1.next=new Node(temp.data);
                temp1=temp1.next;
            }
            else{
                temp2.next=new Node(temp.data);
                temp2=temp2.next;
            } 
            temp=temp.next;
        }
        temp1.next=odd.next;
        return even.next;
    }
}
