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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;

        if(key < root.val){
            root.left = deleteNode(root.left, key);
        }else if (key > root.val){
            root.right = deleteNode(root.right , key);
        }else{
            // root.val == key
            // 1st case --> leaf Node

            if(root.left == null && root.right == null ){
                return null;
            } 

            //2nd case ---> Single child case
            if(root.left == null){ 
                return root.right;
            }else if(root.right == null){
                return root.left;
            }else{ //3rd case --> 2 child case
                // Find predecessor first

                TreeNode node = findpredessor(root.left);
                // Shift the node
                root.val = node.val;
                // delete node.val
                root.left = deleteNode(root.left , node.val);
            }

        }
            return root;

    }

    public TreeNode findpredessor(TreeNode root){
        while(root.right != null){
            root = root.right;
        }
        return root;
    }
}