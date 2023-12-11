package Practice;
import java.util.*;
public class Graph {
    ArrayList<ArrayList<Integer>> adj;
    Graph(int v){
        adj=new ArrayList<>();
        for(int i=0; i<=v;i++){
            adj.add(new ArrayList<Integer>());
        }
    }
    public void addEdge(int src,int desc){
        adj.get(src).add(desc);
    }
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 1);
        g.addEdge(5, 4);
        g.bfs(1);
        g.dfs(1);
    }
    private void bfs(int src) {
        Queue<Integer> q = new LinkedList<Integer>();
        boolean[] visited = new boolean[adj.size()];
        q.add(src);
        while(!q.isEmpty()){
            int top=q.remove();
            System.out.print(top+" --> ");
            for(int neighbour:adj.get(top)){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    q.add(neighbour);
                }
            }
        }
        System.out.println();
    }
    public void dfs(int src){
        Stack<Integer> stack = new Stack<Integer>();
        boolean[] visited = new boolean[adj.size()];
        stack.push(src);
        while(!stack.isEmpty()){
            int top=stack.pop();
            System.out.print(top+" --> ");
            for(int neighbour:adj.get(top)){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    stack.push(neighbour);
                }
            }
        }
        System.out.println();
    }
}
