package Vit.Dsa;
public class Mylist {
    
    
    static class Node{
        int p_id;
        String name;
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
    public static Node insert(Node head ,int index,int data){
        Node x=new Node(data);
        Node temp=head;
        if(index==0){
            x.next=head;
            head=x;
        }
        else{
            int i=1;
            while(i<index){
                i++;
                temp=temp.next;
            }
            x.next=temp.next;
            temp.next=x;
        }
        return head;
    }
    public static Node remove(Node head,int index){
    Node temp=head;
    if(index==0){
        head=head.next;
    }
    else{
        int i=1;
        while(i<index){
            i++;
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    return head;

}
    public static boolean search(Node head,int  key){
        Node temp=head;
        while(temp!=null){
            if(temp.data==key)return true;
            temp=temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next = new Node(2 );
        head.next.next = new Node(3);
        head=insert(head, 0, 0);
        print(head);
        // head=remove(head, 1);
        head=insert(head, 3, 17);
        print(head); 

    }

}
