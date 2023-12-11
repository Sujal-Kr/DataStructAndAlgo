package Vit.Dsa.BinarySearchTree;

public class MyBst {
    Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right=null;
        }
    }
    public void add(int data){
        if(root == null){
            root = new Node(data);
            return;
        }
        Node prev=null;
        Node temp=root;
        while(temp!=null){
            // prev
        }
    }
    public static void main(String[] args) {
        
    }
}
