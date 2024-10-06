public class isSumTree {
    public boolean isSum(Node root) {
        // If the tree is empty, it's considered a sum tree
        if (root == null) return true;

        // If the node is a leaf, it is trivially a sum tree
        if (root.left == null && root.right == null) return true;

        // Recursively check if the left and right subtrees are sum trees
        long leftSum = sum(root.left);
        long rightSum = sum(root.right);

        // Check if the current node satisfies the sum tree property
        if (root.val == leftSum + rightSum && isSum(root.left) && isSum(root.right)) {
            return true;
        }

        return false;
    }

    // Helper function to calculate the sum of a subtree
    private long sum(Node node) {
        if (node == null) return 0;
        return node.val + sum(node.left) + sum(node.right);
    }

    // Node class
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        // Example tree
        Node root = new Node(10);
        root.left = new Node(-2);
        root.right = new Node(6);
        root.left.left = new Node(8);
        root.left.right = new Node(-4);
        root.right.left = new Node(7);
        root.right.right = new Node(5);

        isSumTree solution = new isSumTree();
        System.out.println(solution.isSum(root)); // Output: false
    }
}
