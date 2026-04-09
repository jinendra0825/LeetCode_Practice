class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;

        // if one side is null, go other side
        if(root.left == null) return 1 + minDepth(root.right);
        if(root.right == null) return 1 + minDepth(root.left);

        // both exist → take min
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}