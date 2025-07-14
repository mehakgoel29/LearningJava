import java.util.LinkedList;
import java.util.Queue;

public class Search {
    public static boolean levelOrder(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if (temp.val == k) {  // Check if the current node contains k
                return true;
            }
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
        return false;  // k is not found in the tree
    }

    public static void main(String[] args) {
        // Create a binary tree for demonstration
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Perform level order search and print the result
        int searchKey = 6;
        boolean result = levelOrder(root, searchKey);
        System.out.println(result);
    }

    // TreeNode class representing each node of the binary tree
    static class TreeNode {
        int val;
        TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }
}
