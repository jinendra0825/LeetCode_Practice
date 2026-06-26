class Solution {
    // Direction Vectors
    int dr[] = {-1,1,0,0};
    int dc[] = {0,0,-1,1};

    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        // Traverse on the boundary only

        for(int i = 0 ; i < m ; i++){
            if(grid[0][i] == 1){
                dfs(0 , i , grid , n , m);
            }

            if(grid[n-1][i] == 1){
                dfs(n-1 , i , grid, n , m);
            }
        }

        for(int i = 0 ; i < n; i++){
            if(grid[i][0] == 1){
                dfs(i , 0 , grid, n , m);
            }

            if(grid[i][m-1] == 1){
                dfs(i , m-1, grid, n , m);
            }
        }

        // Store the count
        int cnt = 0;

        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < m; j++){
                if(grid[i][j] == 1){
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public void dfs(int row, int col, int [][] mat, int n , int m){

        mat[row][col] = 0;
        
        for(int i = 0 ; i < 4; i++){
            int nr = row + dr[i];
            int nc = col + dc[i];

            if(nr >= 0 && nr < n && nc >= 0 && nc < m && mat[nr][nc] == 1){
                
                dfs(nr, nc, mat, n , m);
            }
        }

        return;
    }
}