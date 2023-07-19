import java.util.*;

public class EdgeList {
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Integer> graph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(0);
        graph[0].add(2);
        graph[0].add(12);
        graph[1].add(1);
        graph[1].add(2);
        graph[1].add(15);
        graph[2].add(1);
        graph[2].add(3);
        graph[2].add(17);
        graph[3].add(2);
        graph[3].add(3);
        graph[3].add(19);

        for (int i = 0; i < V; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < graph[i].size(); j++) {
                System.out.print(graph[i].get(j) + ",");
            }
            System.out.println();
        }
    }
}
