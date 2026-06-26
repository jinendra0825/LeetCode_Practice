class Solution {
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;

        int vis[][] = new int[n][m];

        for(int i = 0 ; i < n ; i++){
            if(vis[i][0] == 0 && board[i][0] == 'O'){
                dfs(i , 0 , vis , board);
            }

            if(vis[i][m-1] == 0 && board[i][m-1] == 'O'){
                dfs(i , m-1 , vis , board);
            }

        }

        for(int i = 0 ; i < m ; i++){
            if(vis[0][i] == 0 && board[0][i] == 'O'){
                dfs(0 , i , vis , board);
            }

            if(vis[n-1][i] == 0 && board[n-1][i] == 'O'){
                dfs(n-1 , i , vis , board);
            }

        }

        for(int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                if(vis[i][j] == 0 && board[i][j] == 'O' ){
                    board[i][j] = 'X';
                }
            }
        }
    }

    public static void dfs(int i , int j , int[][] vis , char mat[][]){
        vis[i][j] = 1;

        int n = mat.length;
        int m = mat[0].length;

        // Direction
        int dr[] = {-1,1,0,0};
        int dw[] = {0, 0 , -1, 1};

        for(int k = 0 ; k < 4 ; k++){
            int nr = i + dr[k];
            int nc = j + dw[k];

            if(nr >= 0 && nr < n && nc >= 0 && nc < m && vis[nr][nc] == 0 && mat[nr][nc] == 'O'){
                dfs(nr, nc, vis, mat);

            }
        }
    }
}