class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int [][] dp = new int[n][m];

        for(int [] num : dp){
            Arrays.fill(num , -1);
        }
        return sum( n -1 , m-1 , grid , dp);
    }

    public int sum(int i, int j , int [][] mat, int [][] dp){
        if(i == 0 && j == 0){
            return mat[0][0];
        }

        if(i < 0 || j < 0){
            return (int)1e9;
        }

        if(dp[i][j] != -1) return dp[i][j];

        int up = mat[i][j] + sum(i-1 , j , mat, dp);
        int left = mat[i][j] + sum (i , j -1 , mat , dp);

        return dp[i][j] = Math.min(up , left); 
    }
}