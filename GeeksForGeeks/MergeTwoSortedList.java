package GeeksForGeeks;

public class MergeTwoSortedList {
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
        Node head=solution(head1, head2);
        print(head);
    }
    public static Node solution(Node head1,Node head2) {
        Node ans=new Node(-1);
        Node temp=ans;
        Node temp1=head1;
        Node temp2=head2;
        while(temp1!=null&&temp2!=null){
            if(temp1.data<temp2.data){
                temp.next=new Node(temp1.data);
                temp1=temp1.next ;
            }else{
                temp.next=new Node(temp2.data);
                temp2=temp2.next ;
            }

            temp=temp.next;
        }
        while(temp1!=null){
            temp.next=new Node(temp1.data);
            temp1=temp1.next ;
            temp=temp.next;
        }
        while(temp2!=null){
            temp.next=new Node(temp2.data);
            temp2=temp2.next ;
            temp=temp.next;
        }
        return ans.next ;
    }
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
