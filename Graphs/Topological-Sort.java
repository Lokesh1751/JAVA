import java.util.*;

public class TopologicalSort {

    public static void TopoSort(ArrayList<Integer> graph[], int curr, boolean vis[], Stack<Integer> st) {
        // Step1 => mark true for curr node
        vis[curr] = true;

        // Step2 => visit its current nodes
        for (int i = 0; i < graph[curr].size(); i++) {
            int ele = graph[curr].get(i);
            if (!vis[ele]) {
                TopoSort(graph, ele, vis, st);
            }
        }
        // Step3 => Push current element in stack
        st.push(curr);

    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Integer> graph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[2].add(3);
        graph[3].add(1);
        graph[4].add(0);
        graph[4].add(1);
        graph[5].add(0);
        graph[5].add(2);

        boolean vis[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            vis[i] = false;
        }

        // we use stack for the topological sort
        // use dfs traversal
        // as we go by dfs push the element in the stack as we visit it and its
        // neighbours
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                TopoSort(graph, i, vis, st);
            }
        }

        // Step4 => Pop element on by one for get topo sort
        System.out.print("Topological Sort Result is: ");
        while (!st.empty()) {
            System.out.print(st.peek() + " ");
            st.pop();
        }
    }
}
