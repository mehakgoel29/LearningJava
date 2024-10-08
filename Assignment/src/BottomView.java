import java.util.*;
  /*
            Example tree:
                 1
               /   \
              2     3
             / \   / \
            4   5 6   7
                   \
                    8
            Bottom view: 4 2 6 8 3 7
        */

public class BottomView {
    static class Pair {
        int val, depth;

        Pair(int val, int depth) {
            this.val = val;
            this.depth = depth;
        }
    }
    static void bottomView(TreeNode root) {
        TreeMap<Integer, Pair> map = new TreeMap<>();
        bottomViewHelper(root, 0, 0, map);
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        for (int i = 0; i < keys.size(); i++) {
            int key = keys.get(i);
            System.out.print(map.get(key).val + " ");
        }
    }
    static void bottomViewHelper(TreeNode node, int hd, int depth, TreeMap<Integer, Pair> map) {
        if (node == null) {
            return;
        }

        if (!map.containsKey(hd) || map.get(hd).depth <= depth) {
            map.put(hd, new Pair(node.val, depth));
        }


        bottomViewHelper(node.left, hd - 1, depth + 1, map);
        bottomViewHelper(node.right, hd + 1, depth + 1, map);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.left.right = new TreeNode(8);

        System.out.println("Bottom view of the binary tree:");
        bottomView(root);
    }
    static class TreeNode {
        int val;
        TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
}
