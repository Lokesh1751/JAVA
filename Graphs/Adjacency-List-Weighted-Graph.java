import java.util.*;

public class AdjacencyList {
    static class Edge {
        int src;
        int dest;
        int weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void printgraph(ArrayList<Edge> graph[], int V) {
        for (int i = 0; i < V; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < graph[i].size(); j++) {
                if (j != graph[i].size() - 1) {
                    System.out.print("{" + graph[i].get(j).src + "," + graph[i].get(j).dest + ", Weight:"
                            + graph[i].get(j).weight + "},");
                } else {
                    System.out.print("{" + graph[i].get(j).src + "," + graph[i].get(j).dest + ", Weight:"
                            + graph[i].get(j).weight + "}");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2, 3));
        graph[1].add(new Edge(1, 2, 5));
        graph[1].add(new Edge(1, 3, 8));
        graph[2].add(new Edge(2, 0, 17));
        graph[2].add(new Edge(2, 1, 12));
        graph[2].add(new Edge(2, 3, 13));
        graph[3].add(new Edge(3, 1, 14));
        graph[3].add(new Edge(3, 2, 15));
        printgraph(graph, V);

    }
}
