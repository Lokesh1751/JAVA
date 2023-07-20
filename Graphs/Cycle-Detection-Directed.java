import java.util.ArrayList;

public class Cycledetection {

    public static boolean cycledetection(ArrayList<Integer> graph[], boolean vis[], int curr, boolean rec[]) {
        vis[curr] = true;
        rec[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            int ele = graph[curr].get(i);
            if (rec[curr]) {
                return true;
            } else if (!vis[curr]) {
                if (cycledetection(graph, vis, ele, rec)) {
                    return true;
                }
                ;
            }
        }
        rec[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        // Cycle detection for Directed graph
        int V = 4;
        ArrayList<Integer> graph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[1].add(0);
        graph[2].add(0);
        graph[2].add(3);
        graph[3].add(0);

        boolean ans = false;
        for (int i = 0; i < V; i++) {
            ans = cycledetection(graph, new boolean[V], i, new boolean[V]);
        }
        System.out.println(ans);
    }
}
