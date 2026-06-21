class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]>  q = new LinkedList<>();
        int fresh = 0;
       

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j, 0}); // row, col, time
                }
                else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int time = 0 ; 

        int dr[] = {-1, 1 , 0 , 0};
        int dc[] = {0, 0 ,  -1 , 1};

        while(!q.isEmpty()){
            int [] curr = q.poll();

            int r = curr[0];
            int c = curr[1];
            int t = curr[2];

            time = Math.max(time, t);

            for(int i = 0 ; i < 4; i++){ //i < 4 bcs to check the four direction
                int nr = r + dr[i];
                int nc = c + dc[i];

                if(nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc] == 1){
                    grid[nr][nc] = 2; // make rotten
                    fresh--;

                    q.offer(new int [] {nr, nc , t+1});
                }
            }
        }

        return fresh == 0? time : -1; // fresh ka count isliye liya kyuki agar sare fresh visit nahi kar paye to -1 return karna hai. agar fresh 0 ho gaya means humne sare fresh visit kar liye hai to fir jo time hai vo return kardo.

    }
}