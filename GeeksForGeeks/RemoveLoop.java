package GeeksForGeeks;
public class RemoveLoop{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(0);
        head.next.next=new Node(5);
        head.next.next.next=new Node(67);
        head.next.next.next.next=new Node(12);
        head.next.next.next.next.next=head;
        // solution(head);
        quick_solution(head);
        print(head);
    }
    private static void quick_solution(Node head) {
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(fast!=null&&fast.next!=null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                // tracks the previous pointer which points to element pointin to the elements pointing the startingcycleNode...
                slow=head;
                while(slow!=fast){
                    prev=fast;
                    slow=slow.next;
                    fast=fast.next;
                }
                prev.next=null;
                break;
            }
        }
    }
    public static void solution(Node head) {
        Node slow=head;
        Node fast=head;
        boolean loopDetected=false;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                loopDetected=true;
                System.out.println(slow.data+" "+fast.data);
                break;
            }
        }
        if(!loopDetected)return;
        // algo to detect starting of the loop
        Node start=head;
        Node meet=fast;

        while(meet!=start){
            meet=meet.next;
            start=start.next;
        }
        Node temp=meet;
        // find the pointer that connects the start of the loop and make it null
        while(temp.next!=meet){
            temp=temp.next;
        }
        temp.next=null;
    }
}
