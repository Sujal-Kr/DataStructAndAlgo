package Vit.Dsa.Graph;
import java.util.*;

public class Graph {
   
    LinkedList<LinkedList<Integer>> list;
    
    Graph(int v) {
        list = new LinkedList<>();
        for (int i = 0; i <= v; i++) {
            list.add(new LinkedList<>());
        }
    }
    
    public void addEdge(int src, int dest) {
        list.get(src).add(dest);
        // list.get(dest).add(src);
    }
    
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 1);
        graph.addEdge(5, 4);
        System.out.println(graph.list);
        boolean found=graph.bfs(1,5);
        System.out.println(found);
        graph.dfs(1);
        
    }

    private  boolean bfs(int src, int dest) {
        
        Queue<Integer> q = new LinkedList<>();
        boolean visited[]=new boolean[list.size()];
        q.add(src);
        visited[src]=true;
        while(!q.isEmpty()) {
            int top=q.remove();
            System.out.print(top+" --> ");
            for(int i=0; i<list.get(top).size(); i++) {
                int neighbor=list.get(top).get(i);
                if(!visited[neighbor]){
                    visited[neighbor]=true;
                    q.add(neighbor);
                    if(neighbor==dest){
                        System.out.println(neighbor);
                        return true;
                    };
                }
            }
        }
        System.out.println("lost");
        return false;
    }
    private void dfs(int src){
        boolean visited[]=new boolean[list.size()];
        performDfs(src,visited);
    }

    private void performDfs(int src, boolean[] visited) {
        visited[src]=true;
        System.out.print(src+" ");
        for(int neighour:list.get(src)){
            if(!visited[neighour]){
                performDfs(neighour, visited);
            }
        }
    }
    public int sumOfDependencies(){
        int count = 0;
        for(LinkedList<Integer> item: list){
            count+=item.size();
        }
        return count;
    }
}
