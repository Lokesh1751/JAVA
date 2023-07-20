import java.util.ArrayList;

public class Cycledetundir {
    public static boolean Cydetundirected(ArrayList<Integer> graph[], int curr, boolean vis[], int par) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            int ele = graph[curr].get(i);

            // Neighbour number 1
            if (vis[ele] == true && par != ele) {
                return true;
            }
            // Neighbour number 3
            else if (vis[ele] == false) {
                if (Cydetundirected(graph, ele, vis, curr)) {
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {

        // Cycle Detection in Undirected graph
        int V = 6;
        ArrayList<Integer> graph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(1);
        graph[0].add(4);
        graph[1].add(0);
        graph[1].add(4);
        graph[1].add(2);
        graph[2].add(1);
        graph[2].add(3);
        graph[3].add(2);
        graph[4].add(0);
        graph[4].add(1);
        graph[4].add(5);
        graph[5].add(4);

        // three types of neighbours
        // 1)vis[neighbour]==true hai and parent nahi hai (is case me cycle present h)
        // 2)vis[neighbour]==true hai and parent hai curr node ka
        // 3)vis[neighbour]==false and parent bhi nahi hai(is case me visit krdo node
        // ko)

        boolean vis[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            vis[i] = false;
        }
        int par = -1;// parent node
        boolean sol = false;
        for (int i = 0; i < V; i++) {
            if (vis[i] == false) {
                sol = Cydetundirected(graph, i, vis, par);
            }
        }
        System.out.println(sol);
    }
}
