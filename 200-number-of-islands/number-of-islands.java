class Solution {
    // Directions
    int dr[] = {-1,1,0,0};
    int dc[] = {0,0,-1,1};

    public int numIslands(char[][] grid) {
        // to find connected components but in matrix.

        int n = grid.length;
        int m = grid[0].length;

        int vis[][] = new int[n][m];

        int iland = 0;

        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < m ; j++){
                
               if(vis[i][j] == 0 && grid[i][j] == '1'){
                    iland++;
                    visConnected(i , j , vis, grid, n , m);

               }

            }
        }

        return iland;

    }

    public void visConnected(int row , int col, int vis[][], char mat[][], int n , int m){
        vis[row][col] = 1;

        for(int k = 0 ; k < 4; k++){
            int nr = row + dr[k];
            int nc = col + dc[k];

            if(nr >= 0 && nr < n && nc >= 0 && nc < m && vis[nr][nc] == 0 && mat[nr][nc] == '1'){
                visConnected(nr, nc, vis, mat , n , m);
            }
        }
    }
}