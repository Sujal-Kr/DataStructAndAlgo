package Vit.Dsa.Graph;
import java.util.*;
public class Implementation {
    public static void main(String[] args) {
        int v=5;
        int e=10;
        int adj_mat[][]=new int[v+1][e+1];
        ArrayList<LinkedList<Integer>> list=new ArrayList<>();
        
    }
    public static void addEdge(int[][]mat ,int src,int dest){
        mat[src][dest]=1;
        mat[dest][src]=1;
    }
    public static void addEdge(ArrayList<LinkedList<Integer>> list,int src,int dest){
        list.get(src).add(dest);
        list.get(dest).add(src);
    }
}
