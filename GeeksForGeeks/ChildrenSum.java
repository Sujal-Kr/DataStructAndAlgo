package GeeksForGeeks;
import java.util.*;
public class ChildrenSum {
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
        Node root=new Node(35);
        root.left=new Node(20);
        root.right=new Node(15);
        root.left.left=new Node(15);
        root.left.right=new Node(5);
        root.right.left=new Node(10);
        root.right.right=new Node(5);
        System.out.println(solution(root));
    }
    
    private static int solution(Node root) {
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node top=q.remove();
            if(top.left==null&& top.right==null)continue;
            int sum=0;
            if(top.left!=null){
                q.add(top.left);
                sum+=top.left.data;
            }
            if(top.right!=null){
                q.add(top.right);
                sum+=top.right.data;
            }
            if(sum!=top.data)return 0;
        }   
        return 1;
    }
    
}
