class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;

        int [][] dp = new int [n][m];

        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j< m ;j++){
                if(obstacleGrid[i][j] == 1){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = -1;
                }
            }
        }
        return ways(n-1 , m-1 , obstacleGrid , dp);
    }

    public int ways(int i , int j, int [][] mat, int [][] dp){
        if(i == 0 && j == 0 && mat[i][j] != 1){
            return 1;
        }

        if(i < 0 || j < 0 ){
            return 0;
        }

        if(mat[i][j] == 1){
            return 0;
        }

        if(dp[i][j] != -1 ) return dp[i][j];

        int up = ways(i -1, j , mat , dp);
        int down = ways(i , j-1 , mat , dp);

        return dp[i][j] = up + down;
    }
}