package PepCoding.BinaryTree;
import java.util.*;
public class Main {
    
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data,Node left,Node right){
            this.data =data;
            this.left =left;
            this.right =right;
        }
    }
    private static class Pair{
        int state;
        Node node;
        Pair(Node node,int state){   
            this.node = node;
            this.state = state;   
        }
    }
    public static void display(Node node){
        if(node==null)return;
        System.out.print(node.data+" ");
        System.out.print(node.left==null?"NULL ":node.left.data+" ");
        System.out.print(node.right==null?"NULL ":node.right.data+" ");
        System.out.println();
        display(node.left);
        display(node.right);
    }
    public static int size(Node node){
        int size = 1;
        if(node==null)return 0;
        int x=0;
        x=node.right==null?x+=0:x++;
        x=node.left==null?x+=0:x++;
        x=size(node.right)+size(node.left);
        size+=x;
        return size;
    }
    public static int max(Node node){
        int max=Integer.MIN_VALUE;
        if(node==null)return 0;
        max=Math.max(max,node.data);
        max=Math.max(max,Math.max(max(node.left),max(node.right)));
        return max;
    }
    public static int sum(Node node){
        int sum=0;
        if(node==null)return 0;
        sum+=node.data;
        sum+=sum(node.left)+sum(node.right);
        return sum;
    }
    public static int hieght(Node node){
        int h=-1;
        if(node==null)return -1;// return 0 for node hiegth
        h=Math.max(hieght(node.left),hieght(node.right));
        h+=1;
        return h;
    }
    public static void traversal(Node node){
        if(node==null)return;
        System.out.println(node.data+" "+"pre order");
        traversal(node.left);
        System.out.println(node.data+" "+"inorder order");
        traversal(node.right);
        System.out.println(node.data+" "+"Post order");
    }
    public static void linear(Node node){
        Queue<Node> q= new LinkedList<>();
        Queue<Node> ch=new LinkedList<>();
        q.add(node);
        while(q.size()!=0){
            Node top=q.remove();
            System.out.print(top.data+" ");
            if(top.left!=null)ch.add(top.left);
            if(top.right!=null)ch.add(top.right);
            if(q.isEmpty()){
                q=new LinkedList<Node>(ch);
                ch.clear();
                System.out.println();
            }
        }
    }
    public static void orderrwise(Node node){
        // iterative apporach for the traversal
        Stack<Pair> st=new Stack<Pair>();
        st.push(new Pair(node,1));
        String pre="Pre ";
        String in="In ";
        String post="Post ";
        while(!st.isEmpty()){
            Pair top=st.peek();
            // When the state is 1 then go for left node (if left node avilable) and then increase the state.
            if(top.state==1){
                top.state++;
                pre+=top.node.data+" ";
                if(top.node.left!=null){
                    Pair p=new Pair(top.node.left,1);
                    st.push(p);
                    // preorder
                }
            }
            // When the state is 2 then go for right node (if right node available) and then increase the state.
            else if(top.state==2){
                top.state++;
                in+=top.node.data+" ";
                if(top.node.right!=null){
                    Pair p=new Pair(top.node.right,1);
                    st.push(p);
                    // in order
                }
            }
            //  when state is 3 then simply pop the node.
            else {
                post+=top.node.data+" ";
                st.pop();
                // postorder
            }
        }
        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);
    }
    public static ArrayList<Integer> reverseorder(Node node){
        ArrayList<Integer> x=new ArrayList<Integer>();
        Queue<Node> q=new LinkedList<Node>();
        q.add(node);
        while(!q.isEmpty()){
            int size=q.size();
            
            for(int i=0;i<size;i++){
                Node top=q.remove();
                x.add(top.data);
                if(top.right!=null)q.add(top.right);
                if(top.left!=null)q.add(top.left);
            }
        }
        Collections.reverse(x);
        return x;
    } 
    static ArrayList<Node> x;
    public static boolean path(Node node,int data){
        if(node==null)return false;
        if(node.data==data){
            x.add(node);
            return true;
        }
        if(path(node.left,data)){
            x.add(node);
            return true;    
        }
        if(path(node.right,data)){
            x.add(node);
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Integer[] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        Node root =new Node(arr[0],null,null);
        Stack<Pair> st=new Stack<Pair>();
        st.push(new Pair(root,1));
        int index = 0;
        while(st.size()!=0){
            Pair top=st.peek();
            if(top.state==1){
                index++;
                if(arr[index]!=null){
                    Node ln=new Node(arr[index],null,null);
                    top.node.left=ln;
                    Pair p=new Pair(ln,1);
                    st.push(p);
                }
                else{
                    top.node.left=null;
                }
                top.state++;
            }
            else if(top.state==2){
                index++;
                if(arr[index]!=null){
                    Node rn=new Node(arr[index],null,null);
                    top.node.right=rn;
                    Pair p=new Pair(rn,1);
                    st.push(p);
                }
                else{
                    top.node.right=null;
                }
                top.state++;
            }
            else st.pop();
        }
        // display(root);
        // System.out.println(hieght(root));
        // traversal(root);
        //linear(root);
        // System.out.println(reverseorder(root));
        // x=new ArrayList<Integer>(); 
        // path(root,30);
        // System.out.println(x);
        // knodes(root,2);
        printkelementsfar(root,12,2);
    }
    public static void knodes(Node node ,int k){
        if(k<-1)return;
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        int level=0;
        while(!q.isEmpty()&&k>=level){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node top=q.remove();
                if(level==k)System.out.print(top.data+" ");
                if(level>k)break;
                if(top.left!=null)q.add(top.left);
                if(top.right!=null)q.add(top.right);
            }
            level++;
            System.out.println();
        }
    }
    public static void knodes(Node node ,int k,Node block){
        if(k<-1)return;
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        int level=0;
        while(!q.isEmpty()&&k>=level){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node top=q.remove();
                if(top==block)continue;
                if(level==k)System.out.print(top.data+" ");
                if(level>k)break;
                if(top.left!=null)q.add(top.left);
                if(top.right!=null)q.add(top.right);
            }
            level++;
        }
    }
    public static void printkelementsfar(Node node ,int data,int k){
        x=new ArrayList<>();

        path(node,data);
        
        for(int i=0;i<x.size();i++){
            knodes(x.get(i),(k-i),i==0?null:x.get(i-1));
        }
    }
}

