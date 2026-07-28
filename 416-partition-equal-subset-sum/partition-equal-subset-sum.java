import java.util.Arrays;

class Solution {

    public boolean canPartition(int[] arr) {

        int totSum = 0;

        for (int num : arr) {
            totSum += num;
        }

        if (totSum % 2 != 0) {
            return false;
        }

        int target = totSum / 2;

        int[][] dp = new int[arr.length][target + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return isPresent(arr.length - 1, target, arr, dp);
    }

    public boolean isPresent(int ind, int target, int[] arr, int[][] dp) {

        if (target == 0) {
            return true;
        }

        if (ind == 0) {
            return arr[0] == target;
        }

        // Memoization
        if (dp[ind][target] != -1) {
            return dp[ind][target] == 1;
        }

        boolean notTake = isPresent(ind - 1, target, arr, dp);

        boolean take = false;

        if (arr[ind] <= target) {
            take = isPresent(ind - 1, target - arr[ind], arr, dp);
        }

        boolean ans = take || notTake;

        dp[ind][target] = ans ? 1 : 0;

        return ans;
    }
}