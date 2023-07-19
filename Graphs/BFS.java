import java.util.*;

public class BFS {
    public static void BFS(ArrayList<Integer> graph[]) {
        Queue<Integer> q = new LinkedList<>();
        boolean visted[] = new boolean[graph.length];

        // Step1 => Add First Element
        q.add(0);
        while (!q.isEmpty()) {
            // Step2 => Pop Top Element
            int curr = q.remove();
            // Step3 => If visited false then print that value and put its visited true and
            // put its neighbours into the queue
            if (visted[curr] == false) {
                System.out.print(curr + " ");
                visted[curr] = true;
                for (int j = 0; j < graph[curr].size(); j++) {
                    q.add(graph[curr].get(j));
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

        // for BFS we have to traverse the graph as indirect level order traversal
        // use queue data structure
        // firstly we have to go get the first element and put it into queue and find
        // the neighbours and as we remove the elements from the queue mark visited for
        // the given element in the visited array
        BFS(graph);
    }
}
