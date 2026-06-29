import java.util.*;

class Solution {

    // 8 Directions
    int[] dr = {-1,-1,-1,0,0,1,1,1};
    int[] dc = {-1,0,1,-1,1,-1,0,1};

    public int shortestPathBinaryMatrix(int[][] grid) {

        int n = grid.length;

        // Start or destination blocked
        if (grid[0][0] == 1 || grid[n-1][n-1] == 1) {
            return -1;
        }

        // Distance array
        int[][] dist = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{0, 0});
        dist[0][0] = 1;

        while (!q.isEmpty()) {

            int[] curr = q.poll();

            int row = curr[0];
            int col = curr[1];

            // Destination reached
            if (row == n - 1 && col == n - 1) {
                return dist[row][col];
            }

            for (int i = 0; i < 8; i++) {

                int nr = row + dr[i];
                int nc = col + dc[i];

                if (nr >= 0 && nr < n &&
                    nc >= 0 && nc < n &&
                    grid[nr][nc] == 0 &&
                    dist[nr][nc] > dist[row][col] + 1) {

                    dist[nr][nc] = dist[row][col] + 1;
                    q.offer(new int[]{nr, nc});
                }
            }
        }

        return -1;
    }
}