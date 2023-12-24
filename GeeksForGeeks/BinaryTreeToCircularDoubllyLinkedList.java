package GeeksForGeeks;

public class BinaryTreeToCircularDoubllyLinkedList {
    Node head,tail;
    
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left =this.right =null;
        }
    }
    

    public static void main(String[] args) {
        Node root=new  Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.right.right=new Node(60);
        inOrder(root);
        constructCdl();
    }
    
    private static void constructCdl() {
        
    }

    public static void inOrder(Node root) {
        if(root==null) return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
        
    }
}
