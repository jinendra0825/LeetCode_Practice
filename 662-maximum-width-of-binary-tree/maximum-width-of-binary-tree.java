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
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        
        long maxWidth = 0;
        
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0)); // node + index
        
        while(!q.isEmpty()){
            int size = q.size();
            
            long minIndex = q.peek().index; // prevent overflow
            long first = 0, last = 0;
            
            for(int i = 0; i < size; i++){
                Pair curr = q.poll();
                
                long currIndex = curr.index - minIndex;
                
                if(i == 0) first = currIndex;
                if(i == size - 1) last = currIndex;
                
                if(curr.node.left != null){
                    q.offer(new Pair(curr.node.left, 2 * currIndex));
                }
                
                if(curr.node.right != null){
                    q.offer(new Pair(curr.node.right, 2 * currIndex + 1));
                }
            }
            
            maxWidth = Math.max(maxWidth, last - first + 1);
        }
        
        return (int) maxWidth;
    }
}

// helper class
class Pair {
    TreeNode node;
    long index;
    
    Pair(TreeNode node, long index){
        this.node = node;
        this.index = index;
    }
}