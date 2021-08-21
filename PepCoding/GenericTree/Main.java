package PepCoding.GenericTree;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class Main{
    private static class Node{
        int data;
        ArrayList<Node> children=new ArrayList<Node>();
    }
    public static void display(Node node){
        String s= node.data+ "->";
        for(Node child:node.children){
            s+=child.data+" ";
        }
        s+=".";
        System.out.println(s);
        for(Node child:node.children){
            display(child);
        }
    }
    public static int size(Node node){
        int size =0;
        for(Node child:node.children){
            int x=size(child);
            size+=x;
        }
        size+=1;
        return size;
    }
    public static int maximum(Node node){
        int max=Integer.MIN_VALUE;
        for(Node child:node.children){
            int x=maximum(child);
            max=Math.max(max,x);
        }
        max=Math.max(max,node.data);
        return max;
    }
    public static int hieght(Node node){
        int h=0;// node-wise
        for(Node child : node.children){
            int x=hieght(child);
            h=Math.max(h,x);
        }
        h+=1;
        return h;
    }
    public static void traversal(Node node){
        System.out.println( "pre node"+node.data);
        //  pre area of the euler area left side of the tree
        // executes while adding the steps to the stack frame.
        for(Node child : node.children){
            System.out.println("pre edge"+node.data+"-->"+child.data);
            traversal(child);
            System.out.println("post edge"+node.data+"-->"+child.data);
        }
        System.out.println("post node"+node.data); 
        // post area of the euler area right side of the tree.
        // executes after the stack getting wippped out 
    }
    public static void levelorder(Node node) {
        Queue<Node> x = new LinkedList<>();
        x.add(node);
        // it follows the algo of remove print add children
        while(!x.isEmpty()){
            // 1.remove the node from the queue
            node=x.remove();
            // 2.Print the data in it.
            System.out.print(node.data+" ");
            // 3.Add all the children to the queue of the current node.
            for(Node child:node.children){
                x.add(child);
            }
            // 4.repeat this for every node
        }
        System.out.println(".");
    }
    public static void main(String[] args) {
        Node root=null;
        int[] arr={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Stack<Node> st=new Stack<>();
        for(int item:arr){
            if(item==-1)st.pop();
            else{
                Node x=new Node();
                x.data=item;
                if(st.size()>0)st.peek().children.add(x);
                else root=x;
                st.push(x);
            }
        }
        display(root);
        System.out.println(size(root));
        System.out.println(maximum(root));
        System.out.println(hieght(root));
        traversal(root);
        levelorder(root);
    }
}