import java.util.*;

public class KosarajusAlgo {
    public static void toposort(ArrayList<Integer> graph[], int curr, boolean vis[], Stack<Integer> s) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            int ele = graph[curr].get(i);
            if (!vis[ele]) {
                toposort(graph, ele, vis, s);
            }
        }
        s.push(curr);
    }

    public static void dfs(ArrayList<Integer> graph[], int curr, boolean vis[]) {
        vis[curr] = true;
        System.out.print(curr + " ");
        for (int i = 0; i < graph[curr].size(); i++) {
            int ele = graph[curr].get(i);
            if (!vis[ele]) {
                dfs(graph, ele, vis);
            }
        }
    }

    public static void kosaraju(ArrayList<Integer> graph[], int v) {

        // Step 1 -> O(V+E)
        boolean vis[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            vis[i] = false;
        }

        // we use stack for the topological sort
        // use dfs traversal
        // as we go by dfs push the element in the stack as we visit it and its
        // neighbours
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                toposort(graph, i, vis, st);
            }
        }

        // Step2 -> O(V+E)
        ArrayList<Integer> transpose[] = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            vis[i] = false;
            transpose[i] = new ArrayList<>();
        }
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < graph[i].size(); j++) {

                int ele = graph[i].get(j);
                transpose[ele].add(i);
            }
        }

        // Step3 -> O(V+E)
        while (!st.isEmpty()) {
            int curr = st.pop();
            if (!vis[curr]) {
                dfs(transpose, curr, vis);
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        // This algorithm is used to find the strongly connected components in graph
        // strongly connected components vo hote hai jinhe agr hum ek edge se break
        // krege to vo ek alag graph ban bnajyege
        // This algo is used only for directed graph because isme agr direction nahi
        // hogi to strongly connected components nikal hi nhi payege

        // Steps of this algorithm
        // 1) Get nodes in stack(Topological Sort)
        // 2) Transpose the graph(means change the direction of the edges)
        // 3)Do dfs on stack nodes on the transpose graph

        int V = 5;
        ArrayList<Integer> graph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(2);
        graph[0].add(3);
        graph[1].add(0);
        graph[2].add(1);
        graph[3].add(4);

        kosaraju(graph, V);
    }
}
