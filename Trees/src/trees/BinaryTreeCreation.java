package trees;

public class BinaryTreeCreation {
        public static class node{
            public int data;
            public node left;
            public node right;

            node(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }
        static int idx = -1; // Global index to track the current position in the array

        public static node buildTreePreorder(int[] nodes) {
            idx++; // Move to the next index in the array

            // BASE CASE: If current value is -1, it means this node is NULL (no child)
            if (nodes[idx] == -1) {
                return null;
            }

            // STEP 1: Create a new node with the current value
            node newNode = new node(nodes[idx]);

            // STEP 2: Recursively build the left subtree
            newNode.left = buildTreePreorder(nodes);

            // STEP 3: Recursively build the right subtree
            newNode.right = buildTreePreorder(nodes);

            // STEP 4: Return the constructed node (with left and right subtrees attached)
            return newNode;
        }


        public static void main(String[] args) {
            int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            node root= buildTreePreorder(nodes);
            System.out.println(root.data);
        }
}
