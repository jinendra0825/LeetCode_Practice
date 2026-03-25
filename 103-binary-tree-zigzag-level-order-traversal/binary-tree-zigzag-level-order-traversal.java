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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) return ans;

        Queue <TreeNode> q = new LinkedList<>();
        q.offer(root);

        boolean zigzag = false; // false means Left TO right //TRUE MEANS right TO left;

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> currlevel = new ArrayList<>(size);
            for(int i = 0; i < size; i++){
                currlevel.add(0);
            }

            for(int i = 0 ; i <  size; i++){
                TreeNode curr = q.poll();
                int index;

                
                if(zigzag){
                    index = size - i - 1;
                } else {
                    index = i;
                }

                currlevel.set(index ,  curr.val);

                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
                
            }
            zigzag = !zigzag;
            ans.add(currlevel);

        }

        return ans;
    }
}