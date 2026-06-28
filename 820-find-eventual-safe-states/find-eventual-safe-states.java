import java.util.*;

class Solution {

    public List<Integer> eventualSafeNodes(int[][] graph) {

        int n = graph.length;

        boolean[] vis = new boolean[n];
        boolean[] pathVis = new boolean[n];
        int[] check = new int[n]; // 0 = unsafe, 1 = safe

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                dfs(i, graph, vis, pathVis, check);
            }
        }

        for (int i = 0; i < n; i++) {
            if (check[i] == 1) {
                ans.add(i);
            }
        }

        return ans;
    }

    public boolean dfs(int node, int[][] graph, boolean[] vis, boolean[] pathVis, int[] check) {

        vis[node] = true;
        pathVis[node] = true;

        for (int neighbour : graph[node]) {

            if (!vis[neighbour]) {

                if (dfs(neighbour, graph, vis, pathVis, check)) {
                    return true;
                }

            } else if (pathVis[neighbour]) {

                return true;
            }
        }

        pathVis[node] = false;
        check[node] = 1; // Safe node

        return false;
    }
}