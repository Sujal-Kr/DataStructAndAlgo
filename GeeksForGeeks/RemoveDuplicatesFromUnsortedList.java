package GeeksForGeeks;
import java.util.*;
public class RemoveDuplicatesFromUnsortedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(2);
        head.next=new Node(2);
        head.next.next=new Node(2);
        head.next.next.next=new Node(2);
        head.next.next.next.next=new Node(2);
        // print(head);
        head=solution(head);
        print(head);

    }
    private static Node solution(Node head) {
        Set<Integer> set=new HashSet<>();
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            if(set.contains(temp.data)){
                prev.next=temp.next;
            }
            else{
                prev=temp;
            }
            set.add(temp.data);
            temp=temp.next;
        }
        return head;
    }
    private static void print(Node head) {
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
