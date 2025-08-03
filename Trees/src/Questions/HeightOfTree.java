package Questions;
import trees.BinaryTreeCreation;
import trees.BinaryTreeCreation.node;

public class HeightOfTree {
    public static int height(node root){
        if(root==null){
            return 0;
        }
        int leftH=height(root.left);
        int rightH=height(root.right);
        int myHeight=Math.max(leftH,rightH)+1;   // 1 for root
        return myHeight;
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        node root= BinaryTreeCreation.buildTreePreorder(nodes);
        System.out.println("height of tree is: "+height(root));
    }
}
