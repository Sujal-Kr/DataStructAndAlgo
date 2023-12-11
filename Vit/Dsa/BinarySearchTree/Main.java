package Vit.Dsa.BinarySearchTree;
public class Main {
  static class Node {
  Node left, right;
  int data;

  Node(int val) {
    left = null;
    right = null;
    this.data = val;
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
  public static Node delNode(Node root, int key) {
    
    if (root == null) {
      return root;
    }
    
    if (root.data < key) {
      
      root.right = delNode(root.right, key);
    }
  
    else if (root.data > key) {
      
      root.left = delNode(root.left, key);
    } else {
     
      if (root.left == null && root.right == null) {
        return null;
      }
      
      if (root.left == null) {
        return root.right;
      }
      if (root.right == null) {
        return root.left;
      }
     
      else {
    
        Node scr = inorder_scr(root);
        root.data = scr.data;
        root.right = delNode(root.right, key);
      }
    }
    return root;
  }

  public static Node inorder_scr(Node node) {
    
    node = node.right;
    while (node != null && node.left != null) node = node.left;
    return node;
  }
  public static int max(Node node){
      int max=Integer.MIN_VALUE;
      if(node==null)return 0;
      max=Math.max(max,node.data);
      max=Math.max(max,Math.max(max(node.left),max(node.right)));
      return max;
  }

  public static int min(Node node){
    int max=Integer.MAX_VALUE;
    if(node==null)return 0;
    max=Math.min(max,node.data);
    max=Math.min(max,Math.min(min(node.left),min(node.right)));
    return max;
  }
  public static int size(Node node){
    if(node==null)return 0;
    int ls=size(node.left);
    int rs=size(node.right);
    return ls+rs+1;
  }
  public static int leafcount(Node node){
    int count=0;
    if(node==null)return 0;
    count=leafcount(node.left)+leafcount(node.right);
    if(node.left==null&&node.right==null)count++;
    return count;
  }
  public static void main(String[] args) {
    Node root = new Node(10);
    root.left = new Node(5);
    root.right = new Node(15);
    root.left.left = new Node(3);
    root.left.right = new Node(7);
    root.right.left = new Node(13);
    root.right.right = new Node(17);
    print(root);
    delNode(root, 7);
    print(root);
    size(root);
    max(root);
    min(root);
    leafcount(root);
    
  }
  public static void print(Node root) {
    if(root==null)return;
    print(root.left);
    System.out.print(root.data+" ");
    print(root.right);
  }
}



