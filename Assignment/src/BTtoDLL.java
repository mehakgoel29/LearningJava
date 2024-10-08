public class BTtoDLL {
    Node root;
    Node head = null;  // Head of the doubly linked list
    Node prev = null;  // Tracks the previous node during in-order traversal

    // Function to convert binary tree to doubly linked list using in-order traversal
    void convertToDLL(Node node) {
        if (node == null) {
            return;
        }

        // Recur for the left subtree
        convertToDLL(node.left);

        // If prev is null, we're at the leftmost node, which will be the head of the DLL
        if (prev == null) {
            head = node;
        } else {
            // Connect the previous node with the current node
            node.left = prev;
            prev.right = node;
        }

        // Mark the current node as previous before moving to the right subtree
        prev = node;

        // Recur for the right subtree
        convertToDLL(node.right);
    }

    // Function to print the doubly linked list
    void printDLL(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.right;
        }
    }

    public static void main(String[] args) {
        BTtoDLL tree = new BTtoDLL();

        // Creating a binary tree
        tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(20);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(8);
        tree.root.right.left = new Node(15);
        tree.root.right.right = new Node(25);

        // Convert the binary tree to a doubly linked list
        tree.convertToDLL(tree.root);

        // Print the doubly linked list
        tree.printDLL(tree.head);
    }
    static class Node {
        int data;
        Node left, right;  // left is the previous pointer, right is the next pointer

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
