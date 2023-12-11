package GeeksForGeeks;
import java.util.*;
public class SymmetricTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right=null;
        }
    }
    public static void main(String[] args) {
        Node root=new Node(5);
        root.left=new Node(1);
        root.right=new Node(1);
        root.left.left=new Node(2);
        root.right.right=new Node(2);
        boolean ans=solution(root);
        System.out.println(ans);

        

    }
    private static boolean solution(Node root) {
        Queue<Node> x=new LinkedList<>();
        x.add(root);
        x.add(root);
        while(!x.isEmpty()){
            Node left=x.remove();
            Node right=x.remove();
            if(left==null&&right==null) continue;
            if(left==null||right==null) return false;
            if(left.data!=right.data)return false;
            x.add(left.left);
            x.add(right.right);
            x.add(left.right);
            x.add(right.left);
        }
        return true;
    }
}
