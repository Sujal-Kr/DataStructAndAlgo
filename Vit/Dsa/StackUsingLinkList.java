// package Vit.Dsa;

// class Node{
//     int data;
//     Node next;
//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// public class StackUsingLinkList {
    
//     public static Node create(Node head, int data){
//         Node temp = head;
//         Node newNode = new Node(data);
//         if(head==null){
//             head = newNode;
//         }
//         else{
//             while(temp.next != null){
//                 temp = temp.next;
//             }
//         }
//         temp = newNode;
//         return head;
//     }

// public static void display(Node head){
//     Node temp = head;
//     System.out.print("displaying node values:- ");
//     while(temp != null){
//         System.out.print(temp.data);
//         temp = temp.next;
//     }
// }
//         public static void main(String[] args){
//             // Node head = new Node(10);
//             Node head = create(head, 20); 
//             head = create(head, 30);
//             display(head);
            
//         }
// }
