/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    Queue <TreeNode> q = new LinkedList<>();
    public void flatten(TreeNode root) {
        if (root == null) return ;

        preorder(root);
        root.left = null;
        root.right = null;

        TreeNode temp = q.poll();

       while(!q.isEmpty()){
        TreeNode curr = q.poll();

        temp.left = null;
        temp.right = curr;

        temp = curr;
       }

        return;
        
    }

    public void preorder(TreeNode root){
        if(root == null) return;

        q.offer(root);
        preorder(root.left);
        preorder(root.right);

        return;
    }
}