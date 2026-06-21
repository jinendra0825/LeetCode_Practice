class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int m = isConnected[0].length;

        int vis[] = new int[n];
        int cnt = 0;

        for(int i = 0 ; i < n ; i++){
            if(vis[i] == 0){
                cnt++;
                dfs(i , isConnected,  vis);
            }
        }

        return cnt;

    }

    private void dfs(int node ,int [][] isConnected, int vis[]){
        vis[node] = 1;
        
        for (int neighbor = 0; neighbor < isConnected.length; neighbor++) {

            if (isConnected[node][neighbor] == 1 && vis[neighbor] == 0) {
                dfs(neighbor, isConnected, vis);
            }
        }
    }
}