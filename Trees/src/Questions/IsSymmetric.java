package Questions;
import Questions.SameTree.TreeNode;
public class IsSymmetric {
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetricHelper(root.left, root.right);
    }

    public static boolean isSymmetricHelper(TreeNode left, SameTree.TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        return left.val == right.val &&
                isSymmetricHelper(left.left, right.right)&&
                isSymmetricHelper(left.right, right.left);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(2);
        root.left.right=new TreeNode(3);
        root.right.right=new TreeNode(3);

        System.out.println(isSymmetric(root));

    }
}
