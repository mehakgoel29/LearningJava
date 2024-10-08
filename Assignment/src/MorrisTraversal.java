class MorrisTraversal{
        TreeNode root;
        void Traversal(TreeNode root)
        {
            TreeNode current, pre;
            if (root == null)
                return;
            current = root;
            while (current != null)
            {
                if (current.left == null)
                {
                    System.out.print(current.val + " ");
                    current = current.right;
                }
                else {
				/* Find the inorder predecessor of current*/
                    pre = current.left;
                    while (pre.right != null && pre.right != current)
                        pre = pre.right;
                //temporary link creation
                    if (pre.right == null) {
                        pre.right = current;
                        current = current.left;
                    }
                //removal of temporary link
                    else
                    {
                        pre.right = null;
                        System.out.print(current.val + " ");
                        current = current.right;
                    }
                }
            }
        }
        public static void main(String[] args)
        {
		/*
               1
              / \
             2	 3
            / \
           4   5
		*/
            MorrisTraversal tree = new MorrisTraversal();
            tree.root = new TreeNode(1);
            tree.root.left = new TreeNode(2);
            tree.root.right = new TreeNode(3);
            tree.root.left.left = new TreeNode(4);
            tree.root.left.right = new TreeNode(5);

            tree.Traversal(tree.root);
        }
        static class TreeNode {
            int val;
            TreeNode left, right;

            TreeNode(int val)
            {
                this.val = val;
                left = right = null;
            }
        }
}
