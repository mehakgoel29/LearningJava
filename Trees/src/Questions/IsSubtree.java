package Questions;

public class IsSubtree {
    static class TreeNode {
        int data;
        TreeNode left, right;
        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Main function to check if subRoot is a subtree of root
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) return true;  // Empty tree is always a subtree
        if (root == null) return false;    // Can't find non-empty subtree in empty tree

        // If trees match from current node OR check in left/right subtrees
        if (isSameTree(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    // Helper function to check if two trees are identical
    private static boolean isSameTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;       // Dono null -> Same
        if (s == null || t == null) return false;      // Ek null -> Not Same

        if (s.data == t.data) {                          // ✅ Equal value case
            // Left aur Right subtrees bhi match hone chahiye
            return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
        } else {
            return false;                              // Value mismatch
        }
    }

    public static void main(String[] args) {
        // Main Tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Sub Tree
        TreeNode subRoot = new TreeNode(2);
        subRoot.left = new TreeNode(4);
        subRoot.right = new TreeNode(5);

        System.out.println(isSubtree(root, subRoot));
    }
}
