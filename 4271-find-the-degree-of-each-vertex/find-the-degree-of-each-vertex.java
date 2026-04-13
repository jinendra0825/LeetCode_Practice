class Solution {
    public int[] findDegrees(int[][] matrix) {
        int ans[] = new int[matrix.length];

        for(int i = 0 ; i < matrix.length; i++){
            int cnt = 0;
            for(int j = 0 ; j < matrix[0].length; j++){
                if(matrix[i][j] == 1){
                    cnt++;
                }
            }

            ans[i] = cnt;
        }

        return ans;
    }
}