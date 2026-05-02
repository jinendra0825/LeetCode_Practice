class Solution {
    public int findCircleNum(int[][] isConnected) {

        boolean [] visited = new boolean[isConnected.length];

        int cnt = 0;

        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                dfs(i, isConnected, visited);
                cnt++;
            }
        }

        return cnt;



    }

    public void dfs(int start , int [][] isConnected , boolean [] visited ){
        visited [start] = true;

        for(int j = 0 ; j < isConnected.length; j++){
            if(isConnected[start][j] == 1 && !visited[j]){
                dfs (j , isConnected , visited);
            }
        }
    }
}