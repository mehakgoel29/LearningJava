public class Main {
    public static void main(String[] args) {
        // Create a graph with 5 vertices
        int V = 5;
        Graph graph = new Graph(V);

        // Add edges (for undirected graph)
        graph.addEdgeUndirected(0, 1);
        graph.addEdgeUndirected(0, 4);
        graph.addEdgeUndirected(1, 2);
        graph.addEdgeUndirected(1, 3);
        graph.addEdgeUndirected(1, 4);
        graph.addEdgeUndirected(2, 3);
        graph.addEdgeUndirected(3, 4);

        // Print the undirected graph
        System.out.println("Undirected Graph:");
        graph.printGraph();

        // Create a directed graph
        Graph directedGraph = new Graph(V);

        // Add edges (for directed graph)
        directedGraph.addEdgeDirected(0, 1);
        directedGraph.addEdgeDirected(0, 4);
        directedGraph.addEdgeDirected(1, 2);
        directedGraph.addEdgeDirected(1, 3);
        directedGraph.addEdgeDirected(3, 4);

        // Print the directed graph
        System.out.println("\nDirected Graph:");
        directedGraph.printGraph();


        BFStraversal graph1 = new BFStraversal(4);
        graph1.addEdge(0, 1);
        graph1.addEdge(0, 2);
        graph1.addEdge(1, 2);
        graph1.addEdge(2, 3);

        graph1.BFS(0);
    }
}
