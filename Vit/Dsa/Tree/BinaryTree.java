package Vit.Dsa.Tree;
import java.util.*;

public class BinaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data,Node left,Node right){
            this.left  = left;
            this.data = data;
            this.right = right;
        }
    }
    public static class Pair{
        Node node;
        int state;
        Pair(Node node,int state){
            this.node = node;
            this.state = state;
        }
    }
    
    public static void main(String[] args) {
        Integer arr[]={50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        Stack<Pair> st=new Stack<>();
        Node root=new Node(arr[0],null,null);
        st.push(new Pair(root, 1));
        int index=0;
        while(!st.isEmpty()){
            Pair top=st.peek();
            if(top.state==1){
                index++;
                if(arr[index]!=null){
                    Node newNode=new Node(arr[index],null,null);
                    top.node.left=newNode;
                    st.push(new Pair(newNode,1));
                }
                else{
                    top.node.left=null;
                }
                top.state++;
            }
            else if(top.state==2){
                index++;
                if(arr[index]!=null){
                    Node newNode=new Node(arr[index],null,null);
                    top.node.right=newNode;
                    st.push(new Pair(newNode,1));
                }else{
                    top.node.right=null;
                }
                top.state++;
            }
            else{
                st.pop();
            }
        }
        // display(root);
        // System.out.println(sum(root));
        // System.out.println(size(root));
        // System.out.println(height(root));
        preOreder(root);
        System.out.println();
        inOreder(root);
        System.out.println();
        postOreder(root);
    }
    public static void display (Node root){
        if(root==null)return;
        String str="";
        str+=root.left==null?".":root.left.data;
        str+="<--"+root.data+"-->";
        str+=root.right==null?".":root.right.data;
        System.out.println(str);
        display(root.left);
        display(root.right);
    }
    public static int sum(Node root){
        if(root==null)return 0;
        int ls=sum(root.left);
        int rs=sum(root.right);
        return ls+rs+root.data;
    }
    public static int size(Node root){
        if(root==null)return 0;
        int ls=size(root.left);
        int rs=size(root.right);
        return ls+rs+1;
    }
    public static int height(Node root) {
        if(root==null)return -1;
        int lh=size(root.left);
        int rh=size(root.right);
        return 1+Math.max(lh, rh);
    }
    public static void inOreder(Node root){
        if(root==null)return;
        inOreder(root.left);
        System.out.print(root.data+" ");
        inOreder(root.right);
    }
    public static void preOreder(Node root){
        if(root==null)return;
        System.out.print(root.data+" ");
        inOreder(root.left);
        inOreder(root.right);
    }
    public static void postOreder(Node root){
        if(root==null)return;
        inOreder(root.left);
        inOreder(root.right);
        System.out.print(root.data+" ");
    }
}

