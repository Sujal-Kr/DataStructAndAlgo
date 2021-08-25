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
    public static void linewiseorder(Node node) {
        Queue<Node> x = new LinkedList<>();
        Queue<Node> y = new LinkedList<>();
        x.add(node);
        // it follows the algo of remove print add children
        while(!x.isEmpty()) {
            // 1.remove the node from the queue
            node=x.remove();
            System.out.print(node.data+" ");
            for(Node child:node.children){
                y.add(child);
            }
            if(x.isEmpty()){
                x=new LinkedList<>(y);
                y.clear();
                System.out.println();
            }
        }
    }
    public static void zigzag(Node node) {
        Stack<Node> pr=new Stack<>();
        Stack<Node> ch=new Stack<>();
        pr.push(node);
        while(!pr.isEmpty()){
            node = pr.pop();
            System.out.print(node.data+" ");
            int level=1;
            if(level%2==1){
                for(Node child : node.children)ch.push(child);
            }
            else{
                for(int i=node.children.size()-1; i>=0; i--){
                    Node child =node.children.get(i);
                    ch.push(child);
                }
            }
            if(pr.isEmpty()){
                level++;
                pr=ch;
                ch=new Stack<>();
                System.out.println();
            }
        }
    }
    public static void mirror(Node node){
        Queue<Node>  x = new LinkedList<>();
        x.add(node);
        while(!x.isEmpty()){
            // pop the first element from the queue
            node =x.remove();
            // add its child 
            int size=0;
            for(Node child:node.children){
                x.add(child);
                size++;
            }
            // swap its child
            // ezzy pizzy boi 
            for(int i=0,j=size-1;i<j;i++,j--){
                Node temp = node.children.get(i);
                node.children.set(i, node.children.get(j));
                node.children.set(j, temp);
            }
        }
    }
    public static void removeleaf(Node node) {
        for(int i=node.children.size()-1; i>=0; i--){
            Node child= node.children.get(i);
            if(child.children.size()==0)node.children.remove(child);
        }
        for(Node child : node.children){
            removeleaf(child);
        }   
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
        // display(root);
        // System.out.println(size(root));
        // System.out.println(maximum(root));
        // System.out.println(hieght(root));
        // traversal(root);
        // levelorder(root);
        // linewiseorder(root);
        // zigzag(root);
        // mirror(root);
        // linewiseorder(root);
        removeleaf(root);
        linewiseorder(root);
    }
}
