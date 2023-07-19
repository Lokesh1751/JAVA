public class AdjacencyWeightedMatrix {
    public static void main(String[] args) {
        int V = 4;
        int graph[][] = new int[V][V];
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                graph[i][j] = 0;
            }
        }

        // adding elements
        graph[0][2] = 3;
        graph[1][2] = 5;
        graph[1][3] = 6;
        graph[2][0] = 8;
        graph[2][1] = 0;
        graph[2][3] = 1;
        graph[3][1] = 19;
        graph[3][2] = 13;

        for (int i = 0; i < V; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < V; j++) {

                int ele = graph[i][j];
                if (graph[i][j] != 0)
                    System.out.print("{" + i + "," + j + " Weight: " + ele + "},");
            }
            System.out.println();
        }

    }
}
