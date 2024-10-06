import java.util.LinkedList;
import java.util.Queue;

public class BFStraversal {
    private int vertices; // Number of vertices in the graph
    private LinkedList<Integer> adjListArray[]; // Array of Linked Lists to store the graph

    // Constructor to initialize the graph
    public BFStraversal(int vertices) {
        this.vertices = vertices;
        adjListArray = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjListArray[i] = new LinkedList<>(); // Create a linked list for each vertex
        }
    }

    // Method to add an edge (connection) between two vertices
    public void addEdge(int src, int dest) {
        adjListArray[src].add(dest); // Add an edge from src to dest
        adjListArray[dest].add(src); // Since this is an undirected graph, add back edge from dest to src
    }

    // BFS traversal starting from the given vertex
    public void BFS(int startVertex) {
        boolean[] visited = new boolean[vertices]; // To keep track of visited vertices
        Queue<Integer> queue = new LinkedList<>(); // Queue for BFS

        visited[startVertex] = true; // Mark the starting vertex as visited
        queue.add(startVertex); // Enqueue the starting vertex

        System.out.println("BFS Traversal starting from vertex " + startVertex + ":");

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll(); // Dequeue a vertex from the queue
            System.out.print(currentVertex + " "); // Print the current vertex

            // Get all adjacent vertices of the dequeued vertex
            for (int neighbor : adjListArray[currentVertex]) {
                if (!visited[neighbor]) { // If this neighbor hasn't been visited yet
                    visited[neighbor] = true; // Mark it as visited
                    queue.add(neighbor); // Enqueue the neighbor
                }
            }
        }
        System.out.println(); // Print a newline after traversal
    }
}


