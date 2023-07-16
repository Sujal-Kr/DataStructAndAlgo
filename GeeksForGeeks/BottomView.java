package GeeksForGeeks;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;

public class BottomView{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=right=null;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);
        System.out.println(bottomview(root));
    }
    public static class pair{
        int level;
        Node node;
        pair(Node node,int level) {
            this.level=level;
            this.node=node;
        }
    }
    public static List<Integer> bottomview(Node node) {
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(node,0));
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0;i<size;i++) {
                pair top=q.remove();
                
                min=Math.min(min,top.level);
                max=Math.max(max,top.level);

                map.putIfAbsent(top.level,new ArrayList<Integer>());
                map.get(top.level).add(top.node.data);

                if(top.node.left!=null)q.add(new pair(top.node.left,top.level-1));
                if(top.node.right!=null)q.add(new pair(top.node.right,top.level+1));
            }
        }
        for(int i=min;i<=max;i++){
            list.add(map.get(i).get(map.get(i).size()-1));
        }
        return list;
    }
}
