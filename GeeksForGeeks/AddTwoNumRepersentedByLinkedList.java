package GeeksForGeeks;

import Vit.Java.account;

public class AddTwoNumRepersentedByLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        Node first=new Node(1);
        first.next=new Node(2);
        first.next.next=new Node(5);

        Node second =new Node(2);
        second.next=new Node(5);
        
        Node ans=solution(first, second);
        print(ans);
    }
    private static void print(Node head) {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static Node solution(Node first, Node second) {
        Node temp1=reverse(first);
        Node temp2=reverse(second);
        Node ans=new Node(-1);
        Node temp=ans;
        int carry=0;
        while(temp1!=null||temp2!=null){
            int one=temp1!=null?temp1.data:0;
            int two=temp2!=null?temp2.data:0;
            int sum=one+two+carry;
            temp.next=new Node(sum%10);
            carry=sum>9?1:0;
            temp=temp.next;
            temp1=temp1!=null?temp1.next:null;
            temp2=temp2!=null?temp2.next:null;
        }
        if(carry==1)temp.next=new Node(carry);
        return reverse(ans.next);
    }
    public static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node after;
        
        while(curr!=null){
            after=curr.next;
            curr.next=prev;

            prev=curr;
            curr=after;
        }
        return prev;
    }
}
