package GeeksForGeeks;

public class FlattenBinarySearchTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        Node root=new Node(5);
        root.left=new Node(3);
        root.right=new Node(7);
        root.left.left=new Node(2);
        root.left.right=new Node(4);
        root.right.left=new Node(6);
        root.right.right=new Node(8);

        Node ans=flatten(root);
        print(ans);
    }
    public static void print(Node root){
        if(root==null)return ;
        print(root.left);
        System.out.print(root.data+" ");
        print(root.right);
    }
    public static Node flatten(Node root){
        Node ans=new Node(-1);
        inorder(root,ans);
        ans.left=ans.right=null;
        return ans.right;
    }
    public static void inorder(Node curr,Node prev){
        if(curr==null)return;
        inorder(curr.left,prev);
        prev.left=null;
        prev.right=curr;
        prev=curr;
        inorder(curr.right, prev);
    }
}
