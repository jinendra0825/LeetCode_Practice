class Solution {
    public boolean isBipartite(int[][] graph) {
        // Adj list is given but in [][] format
        int [] flag = new int[graph.length];
        Arrays.fill(flag, -1);

        for (int i = 0; i < graph.length; i++) {
            if (flag[i] == -1) {
                if (!dfs(i, flag , graph,  0)) {
                    return false;
                }
            }
        }
        return true;
}

    public boolean dfs(int node, int[]flag, int [][]graph, int currFlag){
            
        flag[node] = currFlag;

        for(int i = 0 ; i < graph[node].length; i++){

            int neighbour = graph[node][i]; 

            if(flag[neighbour] == -1){
                if(!dfs(neighbour , flag , graph, 1-currFlag)){
                    return false;
                }
            }else if(flag[neighbour] == currFlag){
                return false;
            }
        }

        return true;
            
    }
}