class Solution {
    public int rob(int[] nums) {
        int [] dp = new int[nums.length + 1];
        Arrays.fill(dp, -1);

        return fun(nums.length -1 , nums , dp);
    }

    public int fun(int ind, int nums[], int [] dp){
        if(ind == 0) return nums[ind];

        if(ind < 0) return 0;

        if(dp[ind] != -1) return dp[ind];

        int pick = nums[ind] + fun(ind - 2, nums, dp);
        int notPick = 0 + fun(ind -1 , nums, dp);

        return dp[ind] = Math.max(pick, notPick);
    }

}