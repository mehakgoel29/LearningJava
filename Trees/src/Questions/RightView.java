package Questions;

import java.util.*;
import Questions.SameTree.TreeNode;

public class RightView {
    static List<Integer> res=new ArrayList<>();
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
                if (i == size - 1) res.add(curr.val); // last node of the level
            }
        }
        return res;

    }
    public static void main(String[] args) {
        /*
               1
             /   \
            2     3
           /
          4
         /
        5
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(5);

        System.out.println(rightSideView(root)); // Expected: [1, 3, 4, 5]
    }
}
