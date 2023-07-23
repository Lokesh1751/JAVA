import java.util.*;

public class Articulationpoint {

    public static void dfs(ArrayList<Integer> graph[], int curr, boolean vis[], int dt[], int low[], int time,
            int parent, boolean ap[]) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;
        for (int i = 0; i < graph[curr].size(); i++) {
            int ele = graph[curr].get(i);
            if (ele == parent) {
                continue;
            } else if (!vis[ele]) {
                dfs(graph, ele, vis, dt, low, time, curr, ap);
                low[curr] = Math.min(low[curr], low[ele]);
                if (dt[curr] <= low[ele] && parent != -1) {
                    ap[curr] = true;
                }
                children++;
            } else {
                low[curr] = Math.min(low[curr], dt[ele]);
            }
        }
        if (parent == -1 && children > 1) {
            ap[curr] = true;
        }
    }

    public static void getAp(ArrayList<Integer> graph[], int V) {
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        boolean vis[] = new boolean[V];
        boolean ap[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, vis, dt, low, 0, -1, ap);
            }
        }
        for (int i = 0; i < V; i++) {
            if (ap[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        // Articulation point is that vertex which can be deleted and make more than one
        // components of graph

        // Time complexity => O(V+E)
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
        graph[4].add(3);
        getAp(graph, V);
    }
}
