package Questions;
import trees.BinaryTreeCreation;
import  trees.BinaryTreeCreation.node;

public class SumOfNodes {
    public static int sum(node root){
        if(root==null){
            return 0;
        }
        int leftSum=sum(root.left);
        int rightSum=sum(root.right);
        return leftSum+rightSum+root.data;
    }

    public static void main(String[] args) {
        BinaryTreeCreation tree=new BinaryTreeCreation();
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        node root=tree.buildTreePreorder(nodes);
        System.out.println("sum of nodes are: "+sum(root));
    }
}

