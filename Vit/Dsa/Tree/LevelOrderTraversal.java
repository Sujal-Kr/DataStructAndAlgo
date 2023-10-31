package Vit.Dsa.Tree;
import java.util.*;
public class LevelOrderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void main(String[] args) {
        Node root=new Node(50);
        root.left = new Node(12);
        root.right = new Node(25);
        root.left.left=new Node(35);
        root.left.right=new Node(30);
        root.right.left=new Node(26);
        root.right.right=new Node(10);
        solution(root);
    }
    private static void solution(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++){
                Node top=q.remove();
                System.out.print(top.data+" ");
                if(top.left!=null)q.add(top.left);
                if(top.right!=null)q.add(top.right);
            }
            System.out.println();
        }

    }
}
