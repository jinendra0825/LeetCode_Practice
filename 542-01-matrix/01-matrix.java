import java.util.*;

class Solution {
    public int[][] updateMatrix(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int[][] ans = new int[rows][cols];
        boolean[][] vis = new boolean[rows][cols];

        Queue<int[]> q = new LinkedList<>();

        // Add all 0's into queue
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (mat[i][j] == 0) {
                    q.offer(new int[]{i, j, 0}); // row, col, distance
                    vis[i][j] = true;
                }
            }
        }

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {

            int[] curr = q.poll();

            int r = curr[0];
            int c = curr[1];
            int dist = curr[2];

            ans[r][c] = dist;

            for (int k = 0; k < 4; k++) {

                int nr = r + dr[k];
                int nc = c + dc[k];

                if (nr >= 0 && nr < rows &&
                    nc >= 0 && nc < cols &&
                    !vis[nr][nc]) {

                    vis[nr][nc] = true;
                    q.offer(new int[]{nr, nc, dist + 1});
                }
            }
        }

        return ans;
    }
}