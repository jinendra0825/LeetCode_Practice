class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n  = triangle.size();
        int m = triangle.get(triangle.size()-1).size();

         int[][] dp = new int[n][n];

        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        int ans = Integer.MAX_VALUE;

        // Check every element in the last row
        for (int i = 0; i < triangle.get(n - 1).size(); i++) {
            ans = Math.min(ans, sum(n - 1, i, triangle, dp));
        }

        return ans;

    }

    public int sum(int level , int index , List<List<Integer>> list , int [][] dp ){
        // Base case
        if(level == 0 && index == 0){
            return list.get(level).get(index);
        }

        if(level < 0) return (int)1e9;

        //edge cases
        int currlevelSize = list.get(level).size();
        
        if(index < 0 || index >= currlevelSize){
            return (int)1e9;
        }

        if(dp[level][index] != Integer.MAX_VALUE) return dp[level][index];



        int currcheck = list.get(level).get(index) + sum(level-1 , index , list, dp);
        int sideCheck = list.get(level).get(index) + sum(level-1 , index -1 , list, dp);

        return dp[level][index] = Math.min(currcheck , sideCheck);
    }
}