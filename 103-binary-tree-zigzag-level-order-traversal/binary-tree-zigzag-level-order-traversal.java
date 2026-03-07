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

        boolean sign = true; //Right to left --> 1

        Queue <TreeNode>  q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            

            List<Integer> comb = new ArrayList<>(size);

            for(int i = 0 ; i < size; i++){
                comb.add(0);
            }

            for(int i = 0 ; i <size ; i++){
                TreeNode temp = q.poll();
                
                if(!sign){
                    comb.set((size -i-1) , temp.val );
                }else{
                    comb.set(i , temp.val);
                }
                

                if(temp.left != null){
                    q.offer(temp.left);
                }
                if(temp.right != null){
                    q.offer(temp.right);
                }
            }

            sign = !sign;
            ans.add(comb);
        }

        return ans;

    }
}