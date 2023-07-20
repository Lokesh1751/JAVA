import java.util.*;

public class AllPaths {
    // find all paths from src to dest

    public static void findpaths(ArrayList<Integer> graph[], int curr, boolean vis[], String paths, int dest) {
        if (curr == dest) {
            System.out.println(paths);
            return;
        }
        for (int i = 0; i < graph[curr].size(); i++) {
            int ele = graph[curr].get(i);
            if (vis[ele] == false) {
                vis[curr] = true;
                findpaths(graph, ele, vis, paths + ele, dest);
                vis[curr] = false;
            }

        }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Integer> graph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
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

        int src = 0;
        int dest = 5;
        boolean vis[] = new boolean[V];
        for (int i = 0; i < vis.length; i++) {
            vis[i] = false;
        }
        findpaths(graph, src, vis, "0", dest);
    }

}
