package Questions;

import trees.BinaryTreeCreation;
import trees.BinaryTreeCreation.node;

public class CountOfNodes {

    public static int count(node root) {
        if (root == null) return 0;
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        node root = BinaryTreeCreation.buildTreePreorder(nodes);
        System.out.println("Count of nodes: " + count(root));
    }
}
