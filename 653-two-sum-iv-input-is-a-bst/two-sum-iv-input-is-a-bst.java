class Solution {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return dfs(root, k, set);
    }

    public boolean dfs(TreeNode node, int k, HashSet<Integer> set){
        if(node == null) return false;

        // check if pair exists
        if(set.contains(k - node.val)){
            return true;
        }

        set.add(node.val);

        return dfs(node.left, k, set) || dfs(node.right, k, set);
    }
}