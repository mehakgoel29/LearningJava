import java.util.LinkedList;

public class Graph {
    // Number of vertices
    private int vertices;

    // Adjacency list representation
    private LinkedList<Integer> adjListArray[];  //connected to adjListArray = new LinkedList[vertices];

    // Constructor
    public Graph(int vertices) {
        this.vertices = vertices;

        // Initialize adjacency lists for each vertex
        //  Initialize array
        adjListArray = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            //initialise linked list at that particular index
            adjListArray[i] = new LinkedList<>();
        }
    }


    // Method to add an edge in an undirected graph
    public void addEdgeUndirected(int src, int dest) {
        // Add an edge from src to dest
        adjListArray[src].add(dest);

        // Since it's undirected, add an edge from dest to src
        adjListArray[dest].add(src);
    }

    // Method to add an edge in a directed graph (Di-Graph)
    public void addEdgeDirected(int src, int dest) {
        // Add an edge from src to dest (one-way)
        adjListArray[src].add(dest);
    }

    // Method to print the adjacency list representation of the graph
    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Adjacency list of vertex " + i + ": ");
            for (int j = 0; j < adjListArray[i].size(); j++) {
                System.out.print(" -> " + adjListArray[i].get(j));
            }
            System.out.println();
        }
    }
}

