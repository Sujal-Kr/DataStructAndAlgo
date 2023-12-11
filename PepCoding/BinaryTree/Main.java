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
       
        System.out.print(node.left==null?"NULL ":node.left.data+" ");
        System.out.print(node.data+" ");
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
    public static int height(Node node){
        int h=0;
        if(node==null)return 0;// return 0 for node heigth and 1 for edge height
        h=Math.max(height(node.left),height(node.right));
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
        // [5,4,6,null,null,3,7]
        // {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null}
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
        // linear(root);
        // System.out.println(reverseorder(root));
        // x=new ArrayList<Integer>(); 
        // path(root,30);
        // System.out.println(x);
        // knodes(root,2);
        // printkelementsfar(root,12,2);
        // linear(root);
        // mirror(root);
        // linear(root);
        // zigzag(root);
        // System.out.println(leafcount(root));
        // topview(root);
        pathToLeafFromRoot(root,"",0,150,250);
        // leftclonedtree2(root);
        // linear(root);
        // System.out.println();
        // backfromclonedtree2(root);
        // linear(root);
        // SingleChildNode(root);
        // removeleafs(root);
        // linear(root);
        // System.out.println(tiltatree(root));
        // System.out.println(diameter(root));
        // rightView(root);
        // leftview(root);
        // display(root);
        // isBst(root);
        // System.out.println(check);
        BstPair b=IsBst(root);
        // System.out.println(b.isbst);
        System.out.println(balanced2(root));
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
    public static void mirror(Node node){
        Queue<Node> q=new LinkedList<Node>();
        q.add(node);
        while(!q.isEmpty()){ 
            int size=q.size();
            for(int i=0;i<size;i++){
                Node top=q.remove();
                if(top.left!=null)q.add(top.left);
                if(top.right!=null)q.add(top.right);
                if(top.left!=null&&top.right!=null){
                    Node temp=top.left;
                    top.left=top.right;
                    top.right=temp;
                }
            }
        }
    }
    public static void mirror2(Node node) {

        // recurrsive method
        if (node == null)return ;
        Node temp=node.left;
        node.left = node.right;
        node.right=temp;
        mirror2(node.left);
        mirror2(node.right);
    }
    public static void zigzag(Node node){
        Stack<Node> pr=new Stack<Node>();
        Stack<Node> ch=new Stack<Node>();
        pr.push(node);
        int level=1;
        while(pr.size()!=0){
            node =pr.pop();
            System.out.print(node.data+" ");
            if(level%2==1){
                if(node.left!=null)ch.push(node.left);
                if(node.right!=null)ch.push(node.right);
            }
            else {
                if(node.right!=null)ch.push(node.right);
                if(node.left!=null)ch.push(node.left);
            }
            if(pr.isEmpty()){
                System.out.println();
                pr=ch;
                ch=new Stack<Node>();
                level++;
            }
        }
    }
    public static int leafcount(Node node){
        int count=0;
        if(node==null)return 0;
        count=leafcount(node.left)+leafcount(node.right);
        if(node.left==null&&node.right==null)count++;
        return count;
    }
    public static void topview(Node node){
        
        if(node.left!=null)leftview(node);
        System.out.print(node.data+" ");
        if(node.left!=null)rightview(node,0);
        
    }
    public static void leftview(Node node){
        // List<Pair> list =new ArrayList<>();
        // Queue<Pair> x=new LinkedList<>();
        // x.add(new Pair(node,0));
        
        // while(!x.isEmpty()&&node!=null){
        //     int size=x.size();
        //     int level=0;
        //     for(int i=0;i<size;i++){
        //         Pair top=x.remove();
        //         if(i==0){
        //             if(list.isEmpty())list.add(top);
        //             else{
        //                 Pair temp=list.get(list.size()-1);
        //                 if(temp.state)
        //             }
        //         }
        //         if(top.node.left!=null)x.add(top);
        //         if(top.right!=null)x.add(top.right);
    
                
        //     }
        // }
        // System.out.println(list);
    }
    public static void rightview(Node node,int level){
        ArrayList<Integer> list = new ArrayList<>();
        while(node.left!=null||node.right!=null){
            int currlevel = level;
            if(node.right!=null){
                node=node.right;
                level++;
            }
            else{
                if(node.left!=null){
                    node=node.left;
                    level--;
                }
            }
            if(currlevel<level)list.add(node.data);
        }
        for(int item:list)System.out.print(item+" ");
        
    }
    public static void pathToLeafFromRoot(Node node,String path,int sum,int lo,int hi)  {
        if(node==null)return;
        if(node.left==null&&node.right==null){
            sum+=node.data;
            if(lo<=sum&&sum<=hi){
                System.out.println(path+node.data);
            }
            return;
        }
        pathToLeafFromRoot(node.left,path+node.data+" ",+sum+node.data,lo,hi);
        pathToLeafFromRoot(node.right,path+node.data+" ",+sum+node.data,lo,hi);
    }
    public static Node leftclonedtree(Node node){
        if(node ==null)return null;
        // postorder apporach
        Node left=leftclonedtree(node.left);
        Node right=leftclonedtree(node.right);
        // just create a new node with data same as the node data and connect it with left node now connect right with the node and connect the node's left with new node
        Node temp=new Node(node.data,left,null);
        node.left=temp;
        node.right=right;
        // return the node to its upper parrent.
        return node;
    }
    public static void leftclonedtree2(Node node){
        if(node ==null)return;
        // preorder apporach
        Node temp=new Node(node.data,node.left,null);
        node.left=temp;
        leftclonedtree2(node.left.left);
        leftclonedtree2(node.right);
        // not working.
        // absolutely working eassy pizzy boiiii.
        
    }
    public static void backfromclonedtree(Node node) {
        // totally my apporoach 
        // kuch nhi krna bas node ke nexxt ke next call kro(which is non duplicate).
        // phir join it with the node and phir kya jake hanime.tv dekho baki kam recurrsion leap of faith pe chodd do.
        // this is how its done and thats how she likes it.
        if(node==null) return;
        Node temp=node.left.left;
        node.left=temp;
        backfromclonedtree(node.left);
        backfromclonedtree(node.right);
    }
    public static Node backfromclonedtree2(Node node){
        if(node==null)return null;
        // post order appraoch.
        Node left=backfromclonedtree2(node.left.left);
        Node right=backfromclonedtree2(node.right);
        node.left=left;
        node.right=right;
        return node;
    }
    public static void SingleChildNode(Node node){
        if(node==null)return;
        if(node.left!=null&&node.right==null||node.left==null&&node.right!=null){
            System.out.println(node.data);
        }
        SingleChildNode(node.left);
        SingleChildNode(node.right);

    }
    public static Node removeleafs(Node node) {
        if(node==null)return null;
        if(node.left==null&&node.right==null)return null;
        node.left=removeleafs(node.left);
        node.right=removeleafs(node.right);
        return node;
    }
    public static int diameter(Node node){
        int d=0;
        if(node.left!=null)d+=1;
        if(node.right!=null)d+=1;
        d+=height(node.left)+height(node.right);
        return d;
        // works only when diameter passes throug root.
    }
    static int tilt=0;
    public static int  tiltatree(Node node){
        if(node==null)return 0;
        int ls=tiltatree(node.left);
        int rs=tiltatree(node.right);
        int temp=Math.abs(ls-rs);
        tilt+=temp;
        int sum=(ls+rs+node.data);
        return sum;
    }
    public static void rightView(Node node){
        List<Integer> list =new ArrayList<>();
        Queue<Node> x=new LinkedList<>();
        x.add(node);
        while(!x.isEmpty()&&node!=null){
            int size=x.size();
            for(int i=0;i<size;i++){
                Node top=x.remove();
                if(i+1==size)list.add(top.data);
                if(top.left!=null)x.add(top.left);
                if(top.right!=null)x.add(top.right);
            }
        }
        for(int item:list)System.out.print(item+" ");
        System.out.println();
        
    }
    public static class BstPair{
        boolean isbst;
        int min;
        int max;
        int size;
    }    
    public static BstPair IsBst(Node node){
        if(node== null){
            BstPair b = new BstPair();
            b.isbst=true;
            b.min=Integer.MAX_VALUE;
            b.max=Integer.MIN_VALUE;
            return b;
        }
        BstPair lp=IsBst(node.left);
        BstPair rp=IsBst(node.right);
        
        BstPair mp=new BstPair();
        mp.isbst=lp.isbst&&rp.isbst&&node.data>=lp.max&&node.data<=rp.min;
        mp.min=Math.min(node.data,Math.min(lp.min,rp.min));
        mp.max=Math.max(node.data,Math.max(lp.max,rp.max));
        return mp;
    }
    public static boolean balanced(Node node){
        if(node==null)return true;
	    boolean left=balanced(node.left);
	    boolean right=balanced(node.right);
	    boolean m;
	    m=left&&right&&height(node.left)-height(node.right)<=1;
	    return m;
    }  
    static boolean blnc=true;
    public static int balanced2(Node node){
        if(node==null)return 0;
        int lh=balanced2(node.left);
        int rh=balanced2(node.right);
        if(Math.abs(lh-rh)>1)blnc=false;
        // calculate the hieght but make changes in the variable blnc 
        int h=Math.max(lh,rh);
        h+=1;
        return h;
    }
    static int maxh=0;
    public static BstPair largestbst(Node node){
        if(node== null){
            BstPair b = new BstPair();
            b.isbst=true;
            b.min=Integer.MAX_VALUE;
            b.max=Integer.MIN_VALUE;
            b.size=0;
            return b;
        }
        BstPair lp=largestbst(node.left);
        BstPair rp=largestbst(node.right);
        
        BstPair mp=new BstPair();
        mp.isbst=lp.isbst&&rp.isbst&&node.data>=lp.max&&node.data<=rp.min;
        mp.size=Math.max(lp.size,rp.size)+1;
        mp.min=Math.min(node.data,Math.min(lp.min,rp.min));
        mp.max=Math.max(node.data,Math.max(lp.max,rp.max));

        if(mp.isbst){
            mp.size=lp.size+rp.size+1;
        }
        else if(lp.size>rp.size){
            mp.size=lp.size;
        }
        else mp.size=rp.size;
        return mp;
    }
    static List<Integer> list;
	public static long treePathsSum(Node node)
    {
        list=new ArrayList<>();
        int sum=0;
        solution(node,0);
        for(int item:list)sum+=item;
        return (long)sum;
    }
    public static void solution(Node node,int sum){
        if(node==null)return;
        if(node.left==null&&node.right==null){
            sum=sum*10+node.data;
            list.add(sum);
            return;
        }
        solution(node.left,sum*10+node.data);
        solution(node.right,sum*10+node.data);
    }
   
}

