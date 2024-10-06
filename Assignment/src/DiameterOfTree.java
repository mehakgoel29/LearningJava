public class DiameterOfTree {

    static int calcDia(TreeNode root){
        if(root==null){
            return 0; //a tree with null root cannot have a width
        }
        int option1=calcDia(root.left);
        int option2=calcDia(root.right);
        int option3=calcHeight(root.left)+calcHeight(root.right);  //1 is not added here because diameter is measured by edges not nodes
        return Math.max(option1,Math.max(option2,option3));
    }

    private static int calcHeight(TreeNode node) {
        // Base case: a null tree has height 0
        if (node == null) {
            return 0;
        }
        // Calculate height recursively
        int left = calcHeight(node.left);
        int right = calcHeight(node.right);
        return Math.max(left, right) + 1;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        System.out.println(calcDia(root));
    }

    static class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
}
