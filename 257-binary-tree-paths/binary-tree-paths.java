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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        StringBuilder st = new StringBuilder();

        dfs(root, ans, st);

        return ans;
    }

    public void dfs(TreeNode temp, List<String> ans, StringBuilder st) {
        if (temp == null) {
            return;
        }

        int len = st.length();

        st.append(temp.val);

        if (temp.left == null && temp.right == null) {
            ans.add(st.toString());
        } else {
            st.append("->");
            dfs(temp.left, ans, st);
            dfs(temp.right, ans, st);
        }

        st.setLength(len);

        return;
    }
}