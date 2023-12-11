package GeeksForGeeks;

public class IndenticalTree {
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
        Node root1=new Node(1);
        root1.left=new Node(2);
        root1.right=new Node(3);

        Node root2=new Node(1);
        root2.left=new Node(2);
        root2.right=new Node(3);
        boolean ans=solution(root1 ,root2);
        System.out.println(ans);
    }
    private static boolean solution(Node root1, Node root2) {
        if(root1==null&&root2==null)return true;
        if(root1==null^root2==null)return false;
        if(root1.data!=root2.data)return false;
        boolean left=solution(root1.left,root2.left);
        boolean right=solution(root1.right,root2.right);
        return left&&right;
    }
}
