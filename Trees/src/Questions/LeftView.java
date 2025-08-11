package Questions;

import java.util.*;
import Questions.SameTree.TreeNode;

public class LeftView {
    static ArrayList<Integer> res = new ArrayList<>();
    static ArrayList<Integer> leftView(TreeNode root) {
        Queue<SameTree.TreeNode> q=new LinkedList<>();
        if(root==null) return res;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(curr.right!=null) q.add(curr.right);
                if(curr.left!=null) q.add(curr.left);
                if(i==size-1) res.add(curr.val);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        // Build tree manually
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);
        System.out.println(leftView(root)); // Output: [1, 3, 4, 5]
    }
}
