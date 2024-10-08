import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    // Function to perform level order traversal
    public void levelOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            TreeNode temp = q.poll(); // Dequeue the current node
            if(temp==null){
                System.out.println();
                if(!q.isEmpty()){   //still there are elements in the queue
                    q.add(null);
                }
            }
            else{
                System.out.print(temp.val + " "); // Print the current node value

                // Enqueue left child if it exists
                if (temp.left != null) {
                    q.add(temp.left);
                }

                // Enqueue right child if it exists
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create a binary tree for demonstration
        BFS tree = new BFS();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Perform level order traversal
        System.out.println("Level order traversal of the binary tree:");
        tree.levelOrder(root);
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
