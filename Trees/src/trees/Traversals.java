package trees;

import java.util.LinkedList;
import java.util.Queue;

public class Traversals {

        public static class node {
            int data;
            node left;
            node right;

            node(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }

        static int idx = -1; // For building tree

        // Method to build binary tree using preorder input
        public static node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) return null;

            node newNode = new node(nodes[idx]);
            newNode.left = buildTree(nodes);   // Build left subtree
            newNode.right = buildTree(nodes);  // Build right subtree
            return newNode;
        }

        // Preorder Tree.Traversal (Root -> Left -> Right)
        public static void preOrder(node root) {
            if (root == null) return;
            System.out.print(root.data + " "); // Print root first
            preOrder(root.left);
            preOrder(root.right);
        }

        // Inorder Tree.Traversal (Left ->Root ->Right)
        public static void inOrder(node root) {
            if (root == null) return;
            inOrder(root.left);
            System.out.print(root.data + " "); // Print root first
            inOrder(root.right);
        }

        // Inorder Tree.Traversal (Left -> Right -> Root )
        public static void postOrder(node root) {
            if (root == null) return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " "); // Print root first

        }

        public static void levelOrder(node root){
            Queue<node> q= new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data);
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }

            }
        }

        public static void main(String[] args) {
            int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            node root = buildTree(nodes); // Build the tree

            System.out.println("Root Node: " + root.data);
            System.out.print("Preorder Tree.Traversal: ");
            preOrder(root); // Print preorder traversal
            System.out.println();
            System.out.print("Inorder Tree.Traversal: ");
            inOrder(root);
            System.out.println();
            System.out.print("Postorder Tree.Traversal: ");
            postOrder(root);
            System.out.println();
            System.out.print("levelOrder Tree.Traversal: ");
            levelOrder(root);
        }
    }
