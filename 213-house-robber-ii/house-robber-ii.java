class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1 ){
            return nums[0];
        }
        int[] arr1 = Arrays.copyOfRange(nums, 0, nums.length - 1);
        int[] arr2 = Arrays.copyOfRange(nums, 1, nums.length);

        int[] dp1 = new int[arr1.length];
        int[] dp2 = new int[arr2.length];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int ans1 = fun(arr1.length - 1, dp1, arr1);
        int ans2 = fun(arr2.length - 1, dp2, arr2);

        return Math.max(ans1, ans2);

    }

    public int fun(int ind, int[] dp, int[] arr) {

        if (ind < 0)
            return 0;

        if (ind == 0) {
            return arr[ind];
        }

        if (dp[ind] != -1)
            return dp[ind];

        int fs = arr[ind] + fun(ind - 2, dp, arr);
        int ss = 0 + fun(ind - 1, dp, arr);

        return dp[ind] = Math.max(fs, ss);

    }
}