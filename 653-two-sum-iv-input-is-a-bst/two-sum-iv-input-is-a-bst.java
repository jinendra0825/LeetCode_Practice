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
    public boolean findTarget(TreeNode node, int k) {
        List<Integer> ans = new ArrayList<>();
        inorder(node , ans);

        return twoSum(ans, k);
    }

    public void inorder(TreeNode root, List<Integer> ans){
        if(root == null) return;

        inorder(root.left,  ans);
        ans.add(root.val);
        inorder(root.right, ans);

        return;
    }

    public boolean twoSum(List<Integer> ans, int target){
        int i = 0;
        int j = ans.size() - 1;

        while(i < j){
            int sum = ans.get(i) + ans.get(j);

            if(sum == target) return true;

            else if(sum < target){
                i++;
            }else{
                j--;
            }
        }


        return false;
    }
}