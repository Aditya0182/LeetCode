/*********************************************************

 Following is the TreeNode structure:

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;
     TreeNode() {
         this.data = 0;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data, TreeNode left, TreeNode right) {
         this.data = data;
         this.left = left;
         this.right = right;
     }
 };
 ********************************************************/
import java.util.*;
public class Solution {
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        // Write your code here.
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> inorder = new ArrayList<>();
        List<Integer> preorder = new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();

        inorderTraversal(root, inorder);
        preorderTraversal(root, preorder);
        postorderTraversal(root, postorder);

        result.add(inorder);
        result.add(preorder);
        result.add(postorder);

        return result;
    }

    private static void inorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) return;

        inorderTraversal(node.left, list);
        list.add(node.data);
        inorderTraversal(node.right, list);
    }

    private static void preorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) return;

        list.add(node.data);
        preorderTraversal(node.left, list);
        preorderTraversal(node.right, list);
    }

    private static void postorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) return;

        postorderTraversal(node.left, list);
        postorderTraversal(node.right, list);
        list.add(node.data);
    }
}