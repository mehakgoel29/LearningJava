public class SumTree {
    public int toSumTree(Node node) {
        if (node == null) {
            return 0;  // Null node contributes 0
        }
        int left = toSumTree(node.left);
        int right = toSumTree(node.right);
        int RootVal = node.val;
        node.val = left + right;
        return RootVal + node.val;
    }

    public void printInOrder(Node node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.val + " ");
        printInOrder(node.right);
    }

    public static void main(String[] args) {
        // Test case: Creating a binary tree
        Node root = new Node(10);
        root.left = new Node(-2);
        root.right = new Node(6);
        root.left.left = new Node(8);
        root.left.right = new Node(-4);
        root.right.left = new Node(7);
        root.right.right = new Node(5);

        // Creating an instance of SumTree
        SumTree sumTree = new SumTree();

        // Converting the binary tree into a sum tree
        sumTree.toSumTree(root);

        // Printing inorder traversal of the sum tree
        System.out.println("Inorder traversal of the Sum Tree:");
        sumTree.printInOrder(root);  // Expected output: 0 4 0 20 0 12 0
    }
    public static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
}
