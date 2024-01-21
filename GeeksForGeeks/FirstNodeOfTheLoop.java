package GeeksForGeeks;

public class FirstNodeOfTheLoop {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(3);
        head.next.next=new Node(2);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=head.next;
        int ans=solution(head);
        System.out.println(ans);
    }
    public static int solution(Node head){
        Node fast=head;
        Node slow=head;
        while(slow!=null&&fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return fast.data;
            }
        }
        return -1;
    }
}
