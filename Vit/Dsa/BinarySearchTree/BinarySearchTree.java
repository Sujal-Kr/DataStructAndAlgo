package Vit.Dsa.BinarySearchTree;

public class BinarySearchTree {
    
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static Node insert(Node root,int data){
        Node newNode =new Node(data);
        Node temp=root;
        Node prev=null;
        while(temp!=null){
            prev=temp;
            if(data>root.data){
                temp=temp.right;
            }else{
                temp=temp.left;
            }
        }
        if(prev==null){
            root=newNode;
        }else if(data<prev.data){
            prev.left=newNode;
        }else{
            prev.right=newNode;
        }
        return root;
    }
    public static void main(String[] args) {
        Node root=new Node(54);
        root=insert(root, 12);
        root=insert(root,56);   
        root=insert(root,6);
        root=insert(root, 80);
        traversal(root);
    }
    private static void traversal(Node root) {
        if(root==null) return;
        traversal(root.left);
        System.out.println(root.data);
        traversal(root.right);
    }
    boolean isBalanced(Node root)
    {
	    if(root==null)return true;
	    boolean ls=isBalanced(root.left);
	    boolean rs=isBalanced(root.right);
	    int bf=Math.abs(height(root.left)-height(root.right));
        return ls && rs && bf<=1;
    }
    public static int height(Node root){
        if(root==null)return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
}
