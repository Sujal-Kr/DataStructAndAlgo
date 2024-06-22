package GeeksForGeeks;
import java.util.*;

public class MergeKSortedList {
    static class  Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head1=new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(6);
        head1.next.next.next = new Node(8);

        Node head2=new Node(-4);
        head2.next = new Node(5);
        head1.next.next = new Node(7);
        
        
        Node head3=new Node(10);
        head3.next = new Node(11);
        head3.next.next = new Node(12);
        
        Node[]arr={head1,head2,head3};
        Node head=solution(arr);
        print(head);
    }
    private static Node solution(Node []arr) {
        PriorityQueue<Node> pq=new PriorityQueue<>((a,b)->a.data-b.data);
        Node ans=new Node(-1);
        Node temp=ans;
        for(Node head:arr){
            pq.add(head);
        }
        while(!pq.isEmpty()){
            Node top=pq.remove();
            temp.next=new Node(top.data);
            temp=temp.next;
            if(top.next!=null)pq.add(top.next);
        }
        return ans.next;
    }
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
