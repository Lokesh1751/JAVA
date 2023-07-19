import java.util.*;

public class DFS {
        //Time Complexity = O(V+E)
    
    public static void DFS(ArrayList<Integer> graph[], int curr, boolean visited[]) {
        if (visited[curr] == false) {
            System.out.print(curr + " ");
            visited[curr] = true;
            for (int i = 0; i < graph[curr].size(); i++) {
                int ele = graph[curr].get(i);
                if (visited[ele] == false) {
                    DFS(graph, ele, visited);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Integer> graph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Here graph is single connected component
        graph[0].add(1);
        graph[0].add(2);
        graph[1].add(0);
        graph[1].add(3);
        graph[2].add(0);
        graph[2].add(4);
        graph[3].add(1);
        graph[3].add(4);
        graph[3].add(5);
        graph[4].add(2);
        graph[4].add(5);
        graph[4].add(3);
        graph[5].add(3);
        graph[5].add(4);
        graph[5].add(6);
        graph[6].add(5);

        // firstly we have to go get the first element and find its neighbour and then
        // go to neighbours of the neighbour go in depth
        boolean visted[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            visted[i] = false;
        }
        DFS(graph, 0, visted);
    }

}
