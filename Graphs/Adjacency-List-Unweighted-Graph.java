import java.util.*;

public class adjl {
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Integer> graph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(2);
        graph[1].add(2);
        graph[1].add(3);
        graph[2].add(0);
        graph[2].add(1);
        graph[2].add(3);
        graph[3].add(1);
        graph[3].add(2);

        for (int i = 0; i < V; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < graph[i].size(); j++) {
                if (j != graph[i].size() - 1) {
                    System.out.print("{" + i + "," + graph[i].get(j) + "},");
                } else {
                    System.out.print("{" + i + "," + graph[i].get(j) + "}");
                }
            }
            System.out.println();
        }
    }
}
