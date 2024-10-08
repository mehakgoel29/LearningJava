import com.sun.source.tree.Tree;

public class BoundaryTraversal{
  /*
            1
           / \
          2   3
         / \   \
        4   5   6
           / \   \
          7   8   9

    ans: 1 -> 2 -> 4 -> 7 -> 8 -> 9 -> 6 -> 3
    approach:
    * we will be using three functions here :
    * 1 will print the left subtree excluding leaf node
    * 2 will print the leaf node
    * 3 will print the right subtree excluding leaf node in thr reverse order
    */

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(8);

        root.right.right = new TreeNode(6);
        root.right.right.right = new TreeNode(9);

        // Performing boundary traversal
        System.out.println("Boundary Traversal of the tree:");
        boundary(root);
    }
    static void boundary(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        leftTraversal(root.left);
        leafNode(root);
        rightTraversal(root.right);
    }
    static void leftTraversal(TreeNode root){
        if((root ==null) ||(root.left==null && root.right==null)){
            return;
        }
        if(root.left!=null){
            System.out.print(root.val+" ");
            leftTraversal(root.left);
        }
        else{
            System.out.print(root.val+" ");
            leftTraversal(root.right);
        }
    }
    static void rightTraversal(TreeNode root){
        if((root ==null) ||(root.left==null && root.right==null)){
            return;
        }
        if(root.right!=null){
            rightTraversal(root.right);
            System.out.print(root.val+" ");
        }
        else{
            rightTraversal(root.left);
            System.out.print(root.val+" ");
        }
    }

    static void leafNode(TreeNode root) {
        if(root ==null) {
            return;   //tree has no node
        }
        if(root.left==null && root.right==null){
            System.out.print(root.val+" ");
            return;
        }
        leafNode(root.left);
        leafNode(root.right);
    }

    public static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

}
