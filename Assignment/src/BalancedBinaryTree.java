public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        // Base case: A null tree is balanced
        if (root == null) {
            return true;
        }

        // Calculate heights of left and right subtrees
        int leftHeight = calcHeight(root.left);
        int rightHeight = calcHeight(root.right);

        // Check if the height difference is <= 1 and the left and right subtrees are balanced
        return Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int calcHeight(TreeNode node) {
        // Base case: a null tree has height 0
        if (node == null) {
            return 0;
        }
        // Calculate height recursively
        int left = calcHeight(node.left);
        int right = calcHeight(node.right);
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        BalancedBinaryTree treeChecker = new BalancedBinaryTree();
        System.out.println(treeChecker.isBalanced(root));  // Output: true

        // Test case: Create an unbalanced tree
        root.right.right.right = new TreeNode(7);
        System.out.println(treeChecker.isBalanced(root));  // Output: false
    }
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

}

