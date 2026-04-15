class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> ans = new PriorityQueue<>((a , b ) -> b - a);

        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[0].length; j++){
                ans.offer(matrix[i][j]);

                if(ans.size() > k){
                    ans.poll();
                }
            }
        }

        return ans.poll();
    }
}