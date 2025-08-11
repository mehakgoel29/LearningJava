package Questions;
import Questions.SameTree.TreeNode;
import trees.Traversals;

public class IsBalanced {
    public class TreeInfo{
        int ht;
        boolean isBalanced;
        TreeInfo(int ht, boolean isBalanced){
            this.ht=ht;
            this.isBalanced=isBalanced;
        }
    }

    public  boolean isBalanced(TreeNode root){
        return check(root).isBalanced;
    }

    public TreeInfo check(TreeNode root){
        if(root==null) return new TreeInfo(0,true);
        TreeInfo left= check(root.left);
        TreeInfo right= check(root.right);
        int ht=Math.max(left.ht, right.ht)+1;
        boolean balanced= left.isBalanced && right.isBalanced && Math.abs(left.ht- right.ht)<=1;
        return new TreeInfo(ht,balanced);
    }

    public static void main(String[] args) {
        // Manually create the tree:
        //         1
        //        / \
        //       2   3
        //      / \   \
        //     4   5   6

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.right=new TreeNode(7);
        root.right.right.right=new TreeNode(8);
        root.right.right.right.right=new TreeNode(9);

        IsBalanced obj = new IsBalanced();
        boolean result = obj.isBalanced(root);

        System.out.println("Is tree balanced? " + result);
    }

}
