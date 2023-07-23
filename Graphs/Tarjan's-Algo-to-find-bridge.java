import java.util.*;

public class Tarjansalgo {

    // A bridge is that edge which we remove from the graph and it break the graph
    // into two or more components.
    // we use tarjan algorithm here to solve this problem
    public static void dfs(ArrayList<Integer> graph[], int curr, boolean vis[], int dt[], int low[], int time,
            int parent) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        for (int i = 0; i < graph[curr].size(); i++) {
            int ele = graph[curr].get(i);
            if (ele == parent) {
                continue;
            } else if (!vis[ele]) {
                dfs(graph, ele, vis, dt, low, time, curr);
                low[curr] = Math.min(low[curr], low[ele]);
                if (dt[curr] < low[ele]) {
                    System.out.println("Bridge is: " + curr + "----" + ele);
                }
            } else {
                low[curr] = Math.min(low[curr], dt[ele]);
            }
        }
    }

    public static void getbridge(ArrayList<Integer> graph[], int V) {
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        boolean vis[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, vis, dt, low, time, -1);
            }
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Integer> graph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(1);
        graph[0].add(2);
        graph[0].add(3);
        graph[1].add(0);
        graph[1].add(2);
        graph[2].add(0);
        graph[2].add(1);
        graph[3].add(0);
        graph[3].add(4);
        // graph[3].add(5);
        // graph[4].add(5);
        graph[4].add(3);
        // graph[5].add(3);
        // graph[5].add(4);
        getbridge(graph, V);
    }
}
