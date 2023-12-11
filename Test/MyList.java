public class MyList{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;

    }
    // public void reverse(){
    //     Node curr=head;
    //     Node prev=null;
    //     Node after;
    //     while(curr!=null){
    //         after=curr.next;
    //         curr.next=prev;

    //         prev=curr;
    //         curr=after;
    //     }
    //     head=prev;
    // }
    Node reverse(Node head) {
        if(head == null) {
            return head;
        }
        if(head.next == null) {
            return head;
        }
        Node newNode = reverse(head.next);

        head.next.next = head;
        head.next = null;
        return newNode;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        MyList list=new MyList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();
        list.head=list.reverse(list.head);
        list.print();
    
    }
}