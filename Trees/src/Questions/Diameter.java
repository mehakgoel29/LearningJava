package Questions;
import trees.BinaryTreeCreation;
import trees.BinaryTreeCreation.node;

public class Diameter extends HeightOfTree {

    // time comp:o(n^2)
    public static int diameter(node root){
        if(root==null){
            return 0;
        }
        int dia1=diameter(root.left);  // diameter of left subtree
        int dia2=diameter(root.right); // diameter of right subtree
        int dia3=height(root.left)+height(root.right)+1; // diameter through root ..1 for root

        return Math.max(dia1,Math.max(dia2,dia3));
    }

    static class TreeInfo{
        int ht;
        int dia;

        TreeInfo(int ht, int dia){
            this.ht=ht;
            this.dia=dia;
        }
    }

    // time Comp:o(n)
    // calculating the diameter and height simultaneously
    public static TreeInfo diameter2(node root){
        if(root==null){
            return new TreeInfo(0,0);
        }
        TreeInfo left=diameter2(root.left);
        TreeInfo right=diameter2(root.right);

        int myHeight=Math.max(left.ht,right.ht)+1;

        int dia1=left.dia;
        int dia2= right.dia;
        int dia3= left.ht+ right.ht+1;

        int myDia=Math.max(dia1,Math.max(dia2,dia3));
        TreeInfo myInfo= new TreeInfo(myHeight,myDia);
        return myInfo;
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        node root= BinaryTreeCreation.buildTreePreorder(nodes);
        System.out.println("diameter of tree is: "+diameter2(root).dia);
        System.out.println("height of tree is:  "+diameter2(root).ht);
    }
}
