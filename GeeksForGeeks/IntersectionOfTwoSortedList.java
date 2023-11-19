package GeeksForGeeks;
public class IntersectionOfTwoSortedList{
    static class Node{
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
        head.next.next.next.next= new Node(6);

        Node head2=new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(8);

        Node head3=solution(head,head2);
        print(head3);
        
    }
    private static void print(Node head) {
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    private static Node solution(Node head1, Node head2) {
        Node temp1=head1;
        Node temp2=head2;
        Node ans=new Node(-1);
        Node temp3=ans;
        while(temp1 != null&&temp2!=null){
            if(temp1.data==temp2.data){
                temp3.next=new Node(temp1.data);
                temp1=temp1.next;
                temp2=temp2.next;
                temp3=temp3.next;
                
            }
            else if(temp1.data<temp2.data){
                temp1=temp1.next;
            }
            else{
                temp2=temp2.next;
            }
        }
        return ans.next;
    }
}