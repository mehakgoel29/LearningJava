package Questions;
import trees.BinaryTreeCreation.node;
import java.util.LinkedList;
import java.util.Queue;

public class SumOfKNodes {
    public static int sum(node root,int k){
        Queue<node> q=new LinkedList<>();
        int level=1;
        int sum=0;

        q.add(root);
        q.add(null);

        if(k==1){
            return root.data;
        }

        while (!q.isEmpty()){
            node curr=q.remove();

            if(curr==null){
                level++;
                if(q.isEmpty()) break;
                q.add(null);
            }
            else {
                if(level==k){
                    sum += curr.data;
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return sum;
    }

    public static int sumAtEnqueue(node root,int k){
        Queue<node> q=new LinkedList<>();
        int level=1;
        int sum=0;

        q.add(root);
        q.add(null);

        if(k==1) return root.data;

        while (!q.isEmpty()){
            node curr=q.remove();

            if(curr==null){
                level++;
                if(q.isEmpty()) break;
                q.add(null);
            }
            else {
                if(curr.left!=null){
                    q.add(curr.left);
                    if(level+1==k) sum += curr.left.data;
                }
                if(curr.right!=null){
                    q.add(curr.right);
                    if(level+1==k) sum += curr.right.data;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        node root = trees.BinaryTreeCreation.buildTreePreorder(nodes);
        System.out.println(sumAtEnqueue(root,3));
    }
}
