package Practice;
import java.util.*;
public class MyStack {
    
    static class Node{

        int data;
        Node next;
        

        public Node(int data){
            this.data = data;
            next = null;

        }
    }

    static class Stack{

        public  Node head;

        public boolean isEmpty(){
            return head == null?true:false;
        }

        public  void Push(int data){
            Node newNode = new Node(data);

            if(isEmpty()){
                head = newNode;
                return;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }

        public int Pop(){
            if(isEmpty()){
                return -1;
            }
            else if(head.next==null){
                int temp=head.data;
                head=null;
                return temp;
            }
            else{
                Node temp=head;
                while(temp.next.next!=null){
                    temp=temp.next;
                }
                int top=temp.data;
                temp.next=null;
                return top;
            }
            
        }
        public static void fun(){
            System.out.println(" static");
        }

        


        public void Display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        Stack s=new Stack();
        int n=sc.nextInt();
        for(int i=0; i<n;i++){
            s.Push(sc.nextInt());
        }
        int min=merge(s);
        System.out.println(min);
        sc.close();
        
    }

    private static int merge(Stack s) {
        int min=Integer.MAX_VALUE;
        Stack rev=new Stack();
        while(!s.isEmpty()) {
            int temp=s.Pop();
            min=Math.min(min, temp);
            rev.Push(temp);
        }
        while(!rev.isEmpty()) {
            int temp=rev.Pop();
            if(temp!=min){
                s.Push(temp);
            }
        }
        s.Push(min);
        return min;
    }
}
