public class KthSmallestElement {
    private static int count = 0;
   // private int result = -1;

    public static void kthSmallest(TreeNode root, int k) {
        inorderTraversal(root, k);
    }
    private static void inorderTraversal(TreeNode node, int k) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, k);
        count++;
        if (count == k) {
            System.out.println(node.val);
            return;
        }
        inorderTraversal(node.right, k);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        KthSmallestElement tree = new KthSmallestElement();
        int k = 3; // Find the 3rd smallest element
        kthSmallest(root,k);
    }
    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }
}
