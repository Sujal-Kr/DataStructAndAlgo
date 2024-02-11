// package GeeksForGeeks;

// public class SubstractionInLinkedList {
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data = data;
//             this.next=null;
//         }
//     }
//     public static void main(String[] args) {
//         Node first=new Node(5);
//         first.next=new Node(9);
//         first.next.next=new Node(2);

//         Node second =new Node(1);
//         second.next=new Node(2);
        
//         Node ans=solution(first,second);
//         print(reverse(first));
//     }
//     private static Node solution(Node first, Node second) {
//         Node temp1=reverse(first);
//         Node temp2=reverse(second);
//         Node ans=new Node(-1);
//         Node temp=ans;
        
//         while(temp1!=null||temp2!=null){
//             int f=temp1!=null?temp1.data:0;
//             int s=temp2!=null?temp2.data:0;
//             if(f<s){
//                 f*=10;
//                 temp.next=new Node(f-s);
//                 temp=temp.next;
//             }else{

//             }

//         }


//     }
//     public static void print(Node head){
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//     }
//     public static Node reverse(Node head){
//         Node curr=head;
//         Node prev=null;
//         Node after;
//         while(curr!=null){
//             after=curr.next;
//             curr.next=prev;

//             prev=curr;
//             curr = after;
//         }
//         return prev;
//     } 
// }
