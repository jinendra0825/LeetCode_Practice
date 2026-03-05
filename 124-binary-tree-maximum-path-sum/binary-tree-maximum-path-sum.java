// Binary Tree Logic:

// Pehle left ke left jate jana ---> Vaha se apna kaam karna
// Fir right ke right jana ---> Apna kaam karke ----> left or right ko jodna.
// Return karna. 
// ****************************************
// left = recFun(root.left);
// right = recFun(root.right);
// height Logic --->return 1 + Math.max(right , left);

// Try karna new Function bananeka , use height or kaam ka conflict nahi hoga.
// *****************************************

class Solution {
    int maxi = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        
        height(root );
        return maxi;
                
    }

    public int height(TreeNode root){
         if(root == null) return 0;

        int left = Math.max(0 ,  height(root.left));
        int right = Math.max(0 ,  height(root.right));

        maxi = Math.max(maxi , right + left + root.val);
        
        return Math.max(left, right) + root.val;
    }
}