class Solution {
    public int uniquePaths(int m, int n) {
        int [][] dp = new int [m+1][n+1];
        for(int [] nums : dp){
            Arrays.fill(nums , -1);
        }
        return ways(m-1 , n-1 ,dp);
    }

    public int ways(int i , int j ,int [][] dp  ){
        if(i == 0 &&  j == 0){
            return 1;
        }

        if(i < 0 || j < 0){
            return 0;
        }

        if(dp[i][j] != -1) return dp[i][j];

        int up = ways(i -1 , j , dp );
        int down = ways(i, j-1, dp);

        return dp[i][j] = up + down;
    }
}