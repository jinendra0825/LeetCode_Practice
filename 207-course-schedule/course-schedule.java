class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        // Build graph
        for (int[] edge : prerequisites) {
            int course = edge[0];
            int prereq = edge[1];

            adj.get(prereq).add(course);
        }

        boolean[] vis = new boolean[numCourses];
        boolean[] pathVis = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!vis[i]) {
                if (dfs(i, adj, vis, pathVis)) {
                    return false;   // Cycle found
                }
            }
        }

        return true;   // No cycle
    }

    private boolean dfs(int node, List<List<Integer>> adj,
                        boolean[] vis, boolean[] pathVis) {

        vis[node] = true;
        pathVis[node] = true;

        for (int neighbor : adj.get(node)) {

            if (!vis[neighbor]) {

                if (dfs(neighbor, adj, vis, pathVis)) {
                    return true;
                }

            } else if (pathVis[neighbor]) {
                return true;
            }
        }

        // Backtrack
        pathVis[node] = false;

        return false;
    }
}