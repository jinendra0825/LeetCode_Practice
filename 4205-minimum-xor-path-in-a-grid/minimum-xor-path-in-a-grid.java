class Solution {
    int minXor = Integer.MAX_VALUE;
    // int [] dr = {0 , 0 , -1 ,1 };
    // int [] dc = {1 , -1 , 0 , 0};

    public int minCost(int[][] grid) {
        // int n = grid.length;
        // int m = grid[0].length;

        // // boolean [][] pathVis = new boolean[n][m];
        // int xor1 = 0;
        // for(int i = 0 ; i < n , i++){
        //     xor1 ^= grid[0][i];
        //     xor2 ^= grid[i][0];
        // }

        // for(int i = 0 ; i < m , i++){
        //     xor1 ^= grid[0][i];
        //     xor2 ^= grid[i][0];
        // }
        
        // // dfs(grid, 0 , 0 , n , m , 0);

        // // return minXor;

         int m = grid.length;
        int n = grid[0].length;

        HashSet<Integer>[] dp = new HashSet[n];

        for (int j = 0; j < n; j++) {
            dp[j] = new HashSet<>();
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                HashSet<Integer> curr = new HashSet<>();

                if (i == 0 && j == 0) {
                    curr.add(0);
                } else {
                    if (i > 0) curr.addAll(dp[j]);
                    if (j > 0) curr.addAll(dp[j - 1]);
                }

                HashSet<Integer> next = new HashSet<>();
                for (int x : curr) {
                    next.add(x ^ grid[i][j]);
                }

                dp[j] = next;
            }
        }

        return Collections.min(dp[n - 1]);
    }

//     public void dfs(int [][] grid, int row, int col , int n , int m ,  int currXor ){

//         currXor ^= grid[row][col];

//         if (row == n - 1 && col == m - 1) {
//             minXor = Math.min(minXor, currXor);
//             return;
//         }

//         // vis[row][col] = true;
//         // int currXor = grid[row][col];

//         if (col + 1 < m) {
//             dfs(grid, row, col + 1, n , m , currXor);
//         }

//         if (row + 1 < n) {
//             dfs(grid, row + 1, col, n , m , currXor);
//         }

//         // vis[row][col] = false;

//         return ;

//     }
}