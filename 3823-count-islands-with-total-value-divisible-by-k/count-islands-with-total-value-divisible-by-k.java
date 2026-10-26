class Solution {
    int [] dr = { 0 , 0 , 1, -1};
    int [] dc = {1, -1, 0 ,0};

    public int countIslands(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;

        boolean [][] vis = new boolean [n][m];

        int ans = 0;

        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < m ; j++){

                if(!vis[i][j] && grid[i][j] != 0){
                    long sum = dfs(grid, vis, i, j, n, m);

                    if (sum % k == 0) {
                        ans++;
                    }
                }
            }
        }

        return ans;
    }

     public long dfs(int[][] grid, boolean[][] vis,int row, int col, int n, int m) {
        
        vis[row][col] = true;
        long sum = grid[row][col];

        for (int dir = 0; dir < 4; dir++) {
            int nr = row + dr[dir];
            int nc = col + dc[dir];

            if (nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] != 0 && !vis[nr][nc]) {

                sum += dfs(grid, vis, nr, nc, n, m);
            }
        }

        return sum;
    }
}