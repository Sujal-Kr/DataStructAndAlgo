package GeeksForGeeks;

public class ReverseLinkedListInGroupSize {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        // 1->2->2->4->5->6->7->8
        Node head=new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        Node ans=solution(head,4);
        print(ans);
        
    }
    private static void print(Node head) {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static Node solution(Node head,int k){
        if(head==null)return null;
        int i=0;
        Node curr=head;
        Node prev=null;
        Node after=null;
        while(i++<k&&curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        head.next=solution(curr,k);
        return prev;
    }
}
