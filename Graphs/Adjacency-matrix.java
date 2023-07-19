public class AdjacencyMatrix {
    public static void main(String[] args) {
        int V = 4;
        int graph[][] = new int[V][V];
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                graph[i][j] = 0;
            }
        }

        // adding elements
        graph[0][2] = 1;
        graph[1][2] = 1;
        graph[1][3] = 1;
        graph[2][0] = 1;
        graph[2][1] = 1;
        graph[2][3] = 1;
        graph[3][1] = 1;
        graph[3][2] = 1;

        for (int i = 0; i < V; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < V; j++) {
                if (graph[i][j] == 1) {
                    System.out.print("{" + i + "," + j + "},");
                }
            }
            System.out.println();
        }
    }
}
